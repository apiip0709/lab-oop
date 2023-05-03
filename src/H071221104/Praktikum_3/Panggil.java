import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private int balance;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    User (String name, int balance){
        this.name = name;
        this.balance = balance;
    }
}
class Product {
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
}
class Store {
    private String name;
    private String products;
    Store(String name){
        this.name = name;
    }
}


public class Panggil {
    public static void main(String[] args) {
       ArrayList produk = new Arraylist();
       produk.add("HP Pavilion Gaming 15");
       produk.add("ASUS  VivoBook 15 A516MAO N4020");
       produk.add("Lenovo IdeaPad S145");
    }
}
