public class Command {
}

interface SomeCommand{

    void execute();
}
interface SomeDevice{
    void submit();
    void revert();
    void doCommand();
}
class CommandSubmit implements SomeCommand{
    SomeDevice someDevice;
    public CommandSubmit(SomeDevice someDevice){
        this.someDevice=someDevice;
    }
    @Override
    public void execute() {
       someDevice.submit();
    }
}
class CommandRevert implements SomeCommand{
    SomeDevice someDevice;
    public CommandRevert(SomeDevice someDevice){
        this.someDevice=someDevice;
    }
    @Override
    public void execute() {
        someDevice.revert();
    }
}
class Push implements SomeDevice{

    @Override
    public void submit() {

    }

    @Override
    public void revert() {

    }

    @Override
    public void doCommand() {

    }
}
class Pull implements SomeDevice{

    @Override
    public void submit() {

    }

    @Override
    public void revert() {

    }

    @Override
    public void doCommand() {

    }
}
class Commit implements SomeDevice{

    @Override
    public void submit() {

    }

    @Override
    public void revert() {

    }

    @Override
    public void doCommand() {

    }
}

class Button{
    SomeCommand command;
    public Button(SomeCommand command){
     this.command = command;
    }
    void click(){
        command.execute();
    }
}