public class Proxy {
}
interface heavyObject{
    void process();
}
class realyHeavyObject implements heavyObject{
    public realyHeavyObject(){
        startState();
    }
    @Override
    public void process() {
        System.out.println("some large process");
    }
    private void startState(){
        System.out.println("initial statement");
    }
}

class ProxyHeavyObject implements heavyObject{
    private static heavyObject heavyObject;
    @Override
    public void process() {
        if (heavyObject == null){
            heavyObject = new realyHeavyObject();}
            heavyObject.process();
        }
    }

