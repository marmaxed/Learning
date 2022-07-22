//заменяет наследование композицей или агрегацией
// класс мебель, стул и кресло, классические и модерн

 interface Furniture {
 void SitDown();
}

class Sofa implements Furniture {
    @Override
    public void SitDown() {
        System.out.println("You siting on sofa");
    }
}

class Chair implements Furniture {
    @Override
    public void SitDown() {
        System.out.println("You siting on chair");
    }
}

interface Style{
    void SitDown();
}

class Modern implements Style{
    private Furniture furniture;
    public Modern(Furniture furniture){
        this.furniture = furniture;
    }
    @Override
    public void SitDown() {
     furniture.SitDown();
     System.out.println("And it's modern");
    }
}
class Classic implements Style{
    private Furniture furniture;
    public Classic(Furniture furniture){
        this.furniture = furniture;
    }
    @Override
    public void SitDown() {
        furniture.SitDown();
        System.out.println("And it's classic");
    }
}