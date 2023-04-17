import java.util.Scanner;

public class StoreOri {
    public static void main(String[] args) {
        Store store = new Store("Toko Ashiapp");
        User user = new User("Orii", 3000);

        Product produk1 = new Product("Ipong", 1000, 5);
        Product produk2 = new Product("Oddo", 500, 3);
        Product produk3 = new Product("Vovo", 750, 2);

        store.addProduct(produk1);
        store.addProduct(produk2);
        store.addProduct(produk3);

        runStore(store, user);
    }

    public static void runStore(Store store, User user){
        Scanner inp = new Scanner(System.in);

        user.showCard();
        System.out.println("Selamat datang di " + store.getName());
        store.showProduct();
        System.out.println("0. Keluar");

        try {
            int responOption = inp.nextInt();
            int responProd = responOption - 1;

            if (responOption == 0){
                System.out.println("==============================");
                System.out.printf("Sisa uang anda : %d \n", user.getBalance());
                System.out.println("Terima kasih telah berbelanja");
                System.out.println("==============================");
                inp.close();
                return;
            }
            if (responOption < 0){
                responOption = 0;
            }
            
            if (responOption > store.products.size()){
                System.out.println("==============================");
                System.out.println("Maaf opsi tidak ada");
                System.out.println("==============================");
                runStore(store, user);
            }

            System.out.println("Apakah anda yakin ingin membeli :");
            System.out.printf("%s dengan harga $%d ? \n", store.products.get(responProd), store.productsPrice.get(responProd));
            System.out.println("1. Konfirmasi");
            System.out.println("2. Batal");
            System.out.print(">. ");
            int responKonfir = inp.nextInt();

            if (responKonfir == 1){
                store.transaksi(responKonfir, user);
                System.out.println("Lanjutkan transaksi ??");
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
                System.out.print(">. ");
                int responKonfirAction = inp.nextInt();

                if (responKonfirAction == 1){
                    runStore(store, user);
                } else {
                    System.out.println("==============================");
                    System.out.printf("Sisa uang anda : %d \n", user.getBalance());
                    System.out.println("Terima kasih telah berbelanja");
                    System.out.println("==============================");
                    inp.close();
                    return;
                }
            } else if (responKonfir == 2){
                runStore(store, user);
            }
        } catch (Exception e) {
            System.out.println("Maaf input hanya berupa bilangan bulat");
            System.out.println("Byeee ~~~~~");
            inp.close();
            return;
        }
        inp.close();
    }
}
