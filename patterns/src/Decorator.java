//класс обертка

public class Decorator {
}

interface fileread{
    void read();
    //you can add more func and change its in your decorator, or make more decorators for your object
}

class Reader implements fileread{

    @Override
    public void read() {
        System.out.println("I read your file");
    }
}
abstract class FileDecorator implements fileread{
    FileDecorator fileDecorator;
    public FileDecorator(FileDecorator fileDecorator){
        this.fileDecorator=fileDecorator;
    }

    public abstract void read();
}
class FileReaderDecorator extends FileDecorator{

    public FileReaderDecorator(FileDecorator fileDecorator) {
        super(fileDecorator);
    }

    @Override
    public void read() {
     fileDecorator.read();
     System.out.println("Some new features for read in Decorator");
    }
}