import java.util.List;

public class Observable {
}
class OnlineShop{
    private String mainProduct;
    private int amount;
    private List<Clients> clients;
    public void addObserver(Clients client){
        clients.add(client);
    }
    public void removeObserver(Clients client){
        clients.remove(client);
    }
    public void UpdateWarehouse(String mainProduct, int amount){
        this.mainProduct=mainProduct;
        this.amount=amount;
        for(Clients clients: this.clients){
            clients.update(mainProduct,amount);
        }
    }
    public void UpdateWarehouse(int amount){
        this.amount=amount;
        if (amount<5) {
            for (Clients clients : this.clients) {
                System.out.println("Product is running out");
                clients.update(mainProduct, amount);
            }
        }
    }
    public void UpdateWarehouse(String mainProduct){
        this.mainProduct=mainProduct;
            for (Clients clients : this.clients) {
                if (!(clients.getProduct().equals(mainProduct))) {
                    clients.update(mainProduct, amount);
                    System.out.println("Maybe you interested in something else");
                }
            }
        }
}
class Clients{
   private String Product;
   private  int amount;
   public void update(String Product, int amount){
       this.amount = amount;
       this.Product=Product;
   }
   public String getProduct(){
       return Product;
   }
}
//отклик на покупку
//update можно поменять в зависимости от входных данных, чтоб впихнуть условия
//мы можем разширить добавив функции покупки, состояние скидки, большее кол-во товаров, клиентов разной категории
// и условия на рассылку оповещений
//хочу это сделать и где-то использовать
//TODO запихну даже