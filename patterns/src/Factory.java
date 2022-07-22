
interface milk{
    double fats();
}
 class YouUgly implements milk {

     @Override
     public double fats() {
         return 3.2;
     }
 }
 class CoolDrink implements milk {

     @Override
     public double fats() {
         return 2.5;
     }
 }
public class Factory {
    public milk getMilk(String milkType){
        switch(milkType){
            case "Fat": return new YouUgly();
            case "Cool": return new CoolDrink();
            default: return null;
        }
    }
}