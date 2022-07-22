import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyWeight {
}
class lipStick{
    String color;
}
 class flyWeightCosmeticBag {
    Map<String,lipStick> sticks = new HashMap<>();
    lipStick getLipStick(String color){
        lipStick lipStick = sticks.get(color);
       if (sticks.get(color)==null){
           lipStick = new lipStick();
           lipStick.color = color;
           sticks.put(color, lipStick);
       }
       return lipStick;
    }
 }