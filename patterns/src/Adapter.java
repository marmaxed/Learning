
//позволяет адаптировать старый интерфейс под необходимости пользователя
//обертка

public class Adapter implements USB {
    Micro micro;
    public Adapter(Micro micro){
        this.micro=micro;
    }

    @Override
    public void readData() {
        micro.readData();
    }
}
interface Micro{
    public void readData();
}
class MicroUsb  implements  Micro{
    @Override
    public void readData(){
        System.out.println("Micro read");
    }
}
interface USB{
    public void readData();
}
class Usb implements USB{
    @Override
    public void readData() {
        System.out.println("usbRead");
    }
}
//пример функции, где нам может понадобиться адаптер
class Socket {
    public void getData(Usb USB){
        USB.readData();
    }
}
