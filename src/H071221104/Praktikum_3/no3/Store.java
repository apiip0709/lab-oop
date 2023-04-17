import java.util.ArrayList;

public class Store {
    String name;
    
    ArrayList<String> products = new ArrayList<>();
    ArrayList<Integer> productsStock = new ArrayList<>();
    ArrayList<Integer> productsPrice = new ArrayList<>();
    
    public Store(String name){
        this.name = name;
    }

    public void addProduct(Product prod){
        products.add(prod.getName());
        productsPrice.add(prod.getPrice());
        productsStock.add(prod.getStock());
    }

    public void showProduct(){
        System.out.println("Daftar produk : ");

        for (int i = 0; i < products.size(); i+=1){
            System.out.printf("%d. %s - $%d | Stok %d \n", i+1, products.get(i), productsPrice.get(i), productsStock.get(i));
        }
    }

    public void transaksi(int prodNum, User user){
        Product prod = new Product(products.get(prodNum), productsPrice.get(prodNum), productsStock.get(prodNum));

        if (prod.getStock() > 0){
            if(user.getBalance() >= prod.getPrice()){
                user.balance -= prod.getPrice();
                
                prod.itemSell();
                productsStock.set(prodNum, prod.getStock());

                if (prod.getStock() <= 0) {
                    products.remove(prod.getName());
                    productsPrice.remove(Integer.valueOf(prod.getPrice()));
                    productsStock.remove(Integer.valueOf(prod.getStock()));
                }
                System.out.printf("%s Berhasil membeli %s \n", user.getName(), products.get(prodNum));
            } else {
                System.out.println("Barang gagal dibeli, uang anda tidak cukup");
            }
        } else {
            System.out.println("Maaf stock untuk barang ini tidak tersedia");
        }
    }

    public String getName(){
        return this.name;
    }
}
