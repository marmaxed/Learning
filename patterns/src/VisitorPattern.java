public class VisitorPattern {
}

interface Device {
    void mainFunc();
    void update(Visitor visitor);
}

class Phone implements Device{

    @Override
    public void mainFunc() {
        System.out.println("calling");
    }

    @Override
    public void update(Visitor visitor) {
     visitor.addSomeFunc();
    }
}

class Television implements Device{

    @Override
    public void mainFunc() {
        System.out.println("show movie");

    }

    @Override
    public void update(Visitor visitor) {
        visitor.addSomeFunc();
    }
}

interface Visitor {
    void addSomeFunc();
}

class addInternetConnection implements Visitor{
    private void connection(){
        System.out.println("your device is connection to the internet");
    }
    @Override
    public void addSomeFunc() {
        connection();
    }
}

class PhoneVisitor implements Visitor{
    private void photo(){
        System.out.println("now you can make photo");
    };
    private void music(){
        System.out.println("now you can listen music");
    };
    @Override
    public void addSomeFunc() {
        photo();
        music();
    }
}
 class TvVisitor implements Visitor{
     private void skipAdvertising(){
         System.out.println("now you can watch movie without advertising");
     }
     @Override
     public void addSomeFunc() {
       skipAdvertising();
     }
 }