public class Product {
    private String name;
    private int price;
    private int stock;
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int itemSell(){
        this.stock -= 1;
        return this.stock;
    }
}
