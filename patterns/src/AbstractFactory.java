//фабрика фабрик
// продукция молоко(фабрика) и кофе(фабрика)
interface Milk{
    String MilkType();
}

class CoolMilk implements Milk{

    @Override
    public String MilkType() {
        return "HomeInVilLage";
    }
}

class BadMilk implements Milk {

    @Override
    public String MilkType() {
        return "RedFlag";
    }
}

class MilkFactory implements factory{
    @Override
    public Coffee addCoffee(String CoffeeBrand) {
        return null;
    }

    @Override
    public Milk addMilk(String MilkBrand) {
        switch ("MilkBrand"){
            case "RedFlag": return new BadMilk();
            case "HomeInVillage": return new CoolMilk();
            default: return null;
        }
    }
}
interface Coffee{
    String CoffeeBrand();
}

class realCoffee implements Coffee{

    @Override
    public String CoffeeBrand() {
        return "Madeo";
    }
}

class instantCoffee implements Coffee{

    @Override
    public String CoffeeBrand() {
        return "Jacobs";
    }
}

class CoffeeFactory implements factory{

    @Override
    public Coffee addCoffee(String CoffeeBrand) {
        switch(CoffeeBrand){
            case "Jacobs": return new instantCoffee();
            case "Madeo": return new realCoffee();
            default: return null;
        }
    }

    @Override
    public Milk addMilk(String MilkBrand) {
        return null;
    }
}

class BaddMilk implements Milk {

    @Override
    public String MilkType() {
        return "RedFlag";
    }
}


interface factory {
    Coffee addCoffee(String CoffeeBrand);
    Milk addMilk(String MilkBrand);
}

class AbstractFactory{
    factory createFactory(String FactoryType){
        switch (FactoryType){
            case "MilkFactory": return new MilkFactory();
            case "CoffeeFactory": return new CoffeeFactory();
            default: return null;
        }
    }
}