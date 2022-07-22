public class TemplatePattern {
 Template GoodMorning = new WakeUp();
 void letsWakeUp(){
     GoodMorning.Process();
 }
}


abstract class Template{
    public abstract void someAction();
    public abstract void anotherAction();
    public void Process(){
        someAction();
        anotherAction();
    }
}

class  WakeUp extends Template{

    @Override
    public void someAction() {
        System.out.println("Проснулись");
    }

    @Override
    public void anotherAction() {
        System.out.println("Улыбнулись");
    }
}

class goToBed extends Template{

    @Override
    public void someAction() {
        System.out.println("go to shower");
    }

    @Override
    public void anotherAction() {
        System.out.println("fall asleep/");
    }
}