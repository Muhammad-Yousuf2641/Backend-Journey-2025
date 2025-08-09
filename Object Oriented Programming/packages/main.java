import Store.Product;
public class main{
    public static void main(String[] args) {
        Product obj =new Product("T-shirts",200,750.00);
        obj.add_stock(50);
        obj.reduce_stock(20);
        obj.add_stock(500);
        obj.get_stockstatus();


    }
}