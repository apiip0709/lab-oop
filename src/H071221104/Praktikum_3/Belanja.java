package Semester2.Praktikum.Pertemuan3;

import java.util.ArrayList;
import java.util.Scanner;
class User {
    User (){}
    String name;
    int balance;
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
}

class Product {
    String name;
    int price;
    int stock;
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    Product (String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class Store {
    String name;
    Store (String name){
        this.name = name;
    }
public class Belanja {
    public static void main(String[] args) {
        Store store = new Store("Sisfo Computer");
        ArrayList<String> daftarBarang = new ArrayList<>();
        daftarBarang.add("HP Pavilion Gaming 15");
        daftarBarang.add("ASUS  VivoBook 15 A516MAO N4020");
        daftarBarang.add("Lenovo IdeaPad S145");
    
        ArrayList<Integer> hargaBarang = new ArrayList<>();
        hargaBarang.add(2000);
        hargaBarang.add(4000);
        hargaBarang.add(1500);
    
        ArrayList<Integer> stokBarang = new ArrayList<>();
        stokBarang.add(15);
        stokBarang.add(4);
        stokBarang.add(2);
        System.out.println("Selamat datang di " + store.name);
        System.out.println("Daftar Produk:");
        for (int i = 0; i < daftarBarang.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBarang.get(i) + " - $" + hargaBarang.get(i) + "| Stok " + stokBarang.get(i));
            } 
        }  
    }
}

