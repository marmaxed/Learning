//при использовании сложной библиотеки фреймворка, для упрощения их использования для клиента


public class Facade {
public void JustWantSeeMovie(){
    ControlSystem connt = new ControlSystem(new controller(true));
    TV tv = new TV(connt.controller,connt);
    tv.SHOW();
}

}
class controller{
    private boolean Click = false;
    public controller(Boolean Click){
        this.Click=Click;
    }
    public boolean IsPressed(){
        return Click;
    }
}

class ControlSystem{
    controller controller;
    public  ControlSystem(controller controller){
        this.controller=controller;
    }
    public boolean isPressed(){
        return controller.IsPressed();
    }
    public void OFF(){
        this.controller = new controller(false);
    }
    public void ON(){
        this.controller = new controller(true);
    }
}
class TV{
    private controller controller;
    private ControlSystem controlSystem;
    public TV(controller controller, ControlSystem controlSystem){
        this.controller=controller;
        this.controlSystem=controlSystem;
    }
    public void SHOW(){
        if (controller.IsPressed()){
            System.out.println("you pressed on controller and now you see movie");
        }
        else {controlSystem.ON();
        System.out.println("you change condition manually");
        System.out.println("and now you see movie");}
    }
}