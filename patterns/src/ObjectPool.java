import java.util.LinkedList;
import java.util.List;

public class ObjectPool {

}
 class SomeObjects{
    List<SomeObjects> free = new LinkedList<>();
    List<SomeObjects> used = new LinkedList<>();
    public SomeObjects getSomeObjects(){
        if (free.isEmpty()){
            SomeObjects someObjects = new SomeObjects();
            free.add(someObjects);
            return someObjects;
        } else {
            SomeObjects someObjects = free.get(0);
            used.add(someObjects);
            free.remove(someObjects);
            return someObjects;
        }
     }
     public void StopUsing(SomeObjects someObject){
        free.add(someObject);
        used.remove(someObject);
     }
 }
 //если есть свободные объекты используем их, если нет - создаем
