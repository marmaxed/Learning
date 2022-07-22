public class StrategyPattern {
}

interface Strategy{
    double pay(double price);
}
class RegularCustomer implements Strategy{

    @Override
    public double pay(double price) {
        return  price*0.9;
    }
}

class BirthdaySail implements Strategy{

    @Override
    public double pay(double price) {
        return price*0.85;
    }
}

class regularCustomer implements Strategy {

    @Override
    public double pay(double price) {
        return price;
    }
}

class CustomerService{
    Strategy strategy;
    double clientsMoney;
    double productPrice;
    void doShop(Strategy strategy){
        this.clientsMoney -= strategy.pay(productPrice);
    }
}