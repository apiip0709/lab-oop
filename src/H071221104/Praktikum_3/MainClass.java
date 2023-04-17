package Semester2.Praktikum.Pertemuan3;
import java.util.ArrayList;
import java.util.Scanner;
class User {
    String name;
    int balance;
    int pilihan;
    int konfirmasi;
    int transaksi;
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
    int harga = 0;
}

public class MainClass {
    public static void main(String[] args) {
        ArrayList product = new ArrayList<>();
        Store store = new Store();
        User user = new User();
        Scanner input = new Scanner(System.in);
        do {
        Product produk1 = new Product("HP Pavilion Gaming 15", 2000, 15);
        Product produk2 = new Product("ASUS  VivoBook 15 A516MAO N4020", 4000, 4);
        Product produk3 = new Product("Lenovo IdeaPad S145", 1500, 2);
        System.out.print("Masukkan nama pengguna: ");
        user.name = input.nextLine();
        System.out.print("Masukkan jumlah uang yang dimiliki: ");
        user.balance = input.nextInt();
        System.out.println("----------CARD----------");
        System.out.println(user.name);
        System.out.println(user.balance);
        System.out.println("------------------------");
        System.out.println("Selamat Datang di " + store.name);
        System.out.println("Daftar Produk");
        System.out.println("1." + produk1.name + " - $" + produk1.price + " | Stok " + produk1.stock );
        System.out.println("2." + produk2.name + " - $" + produk2.price + " | Stok " + produk2.stock );
        System.out.println("3." + produk3.name + " - $" + produk3.price + " | Stok " + produk3.stock );
        System.out.println("0.Keluar");
        System.out.print("> ");
        } while (user.pilihan != 0);
        user.pilihan = input.nextInt();
        do {
        if (user.pilihan == 1){
            user.balance = user.balance - produk1.price;
            if (user.balance >= 0){
                System.out.println("Apakah anda yakin ingin membeli: ");
                System.out.println(produk1.name + ", " + "dengan Harga $" + produk1.price);
                System.out.println("1. Konfirmasi");
                System.out.println("2. Batal");
                System.out.print("> ");
                user.konfirmasi = input.nextInt();
                if (user.konfirmasi == 1){
                    product.add(produk1.nama);
                    produk1.stock -= 1;
                    store.harga += produk1.price;
                    System.out.println(user.name + " berhasil membeli " + produk1.name + ".");
                    System.out.println("---------------");
                    System.out.println("Lanjutkan Transaksi?");
                    System.out.println("1. Iya");
                    System.out.println("2. Tidak");
                    System.out.print("> ");
                    user.transaksi = input.nextInt();
                }
            } else {
                System.out.println("uang anda tidak cukup");
            }
        } else if (user.pilihan == 2){
            if (user.balance >= produk2.price){
                System.out.println("Apakah anda yakin ingin membeli: ");
                System.out.println(produk2.name + ", " + "dengan Harga $" + produk2.price);
                System.out.println("1. Konfirmasi");
                System.out.println("2. Batal");
                System.out.print("> ");
                user.konfirmasi = input.nextInt();
                if (user.konfirmasi == 1){
                    System.out.println(user.name + " berhasil membeli " + produk2.name + ".");
                    System.out.println("---------------");
                    System.out.println("Lanjutkan Transaksi?");
                    System.out.println("1. Iya");
                    System.out.println("2. Tidak");
                    System.out.print("> ");
                    user.transaksi = input.nextInt();
                }
            } else {
                System.out.println("Uang anda tidak cukup");
            }
        } else if (user.pilihan == 3){
            if (user.balance >= produk1.price){
                System.out.println("Apakah anda yakin ingin membeli: ");
                System.out.println(produk3.name + ", " + "dengan Harga $" + produk3.price);
                System.out.println("1. Konfirmasi");
                System.out.println("2. Batal");
                System.out.print("> ");
                user.konfirmasi = input.nextInt();
                if (user.konfirmasi == 1){
                    System.out.println(user.name + " berhasil membeli " + produk3.name + ".");
                    System.out.println("---------------");
                    System.out.println("Lanjutkan Transaksi?");
                    System.out.println("1. Iya");
                    System.out.println("2. Tidak");
                    System.out.print("> ");
                    user.transaksi = input.nextInt();
                }
            } else {
                System.out.println("Uang anda tidak cukup");
            }
        }
        input.close();
    } while(user.transaksi == 2);
        System.out.println("Anda membeli produk: ");
        System.out.println(product);
        System.out.println("Dengan harga: " + store.harga);
    }
}

