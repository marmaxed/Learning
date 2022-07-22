import jdk.dynalink.linker.LinkerServices;

import java.util.List;
import java.util.Stack;

public class MementoPattern {

}

class SomeClass {
    private String classState;

    public String getClassState() {
        return classState;
    }

    public void setClassState(String classState) {
        this.classState = classState;
    }
    public Memento createMemento(){
        return new Memento(classState);
    }
    public void returnStateMemento(Memento memento){
        this.classState = memento.getState();
    }

}


class Memento {
    private String state;

    public String getState(){
        return state;
    }

    public Memento(String state){
        this.state = state;
    }
}

class CareTaker {
    private Memento memento;

    public Memento getMemento(){
        return memento;
    }
    public void setMemento(){
        this.memento=memento;
    }

}

//optional


class CareTakerStack {
    private Stack<Memento> memento;
    public Memento getMemento(){
        return memento.pop();
    }
    public void setMemento(Memento memento){
        this.memento.add(memento);
    }

}