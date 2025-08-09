package Store;

public  class Product{

private String productName;
private int stock;
private double price;

// constructor 
public Product(String name, int stock, double price) {
    this.productName=name;
    this.stock=stock;
    this.price=price;
}

public void get_stockstatus(){
    System.out.println("Product Name: "+productName+"\n"+" Stock: "+stock+"\n"+" Price: "+price+"\n");
}
public int add_stock(int qty){
    stock += qty;
    return stock;
    }
public int reduce_stock(int qty){
    stock -= qty;
    return stock;

}

}