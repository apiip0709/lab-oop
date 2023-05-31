public class Ramayana {
    String alamat;
    String produk;
    int harga;
    int uang;
    
    public Ramayana() {}

    // constructor
    public Ramayana(String produk, int harga, int uang) {
        this.produk = produk;
        this.harga = harga;
        this.uang = uang;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // metod untuk menampilkan nama dan tempat
    public void lokasi() {
        System.out.println("Selamat datang di toko Ramayana");
        System.out.println("Alamat toko " + getAlamat());
    }
    
    // produk yang dimiliki
    public void produk() {
        System.out.printf("Produk %s dengan harga Rp.%d\n",produk,harga);
    }

    // metod untuk diskon yang di dapatkan dengan parameter hari hari raya
    public void event(String hariHari) {
        // kondisi yang dimana cuman ada dua dan disetiap event berbeda potongan harga yang diberikan
        if (hariHari == "ramadhan") {
            harga = harga - (harga * 50 / 100);
            System.out.println("\nDiskon Ramadhan sebesar 50%");
            System.out.printf("Harga %s setelah mendapatkan potongan yaitu Rp.%d",produk,harga);
        } else if (hariHari == "weekend") {
            harga = harga - (harga * 20 / 100);
            System.out.println("\nDiskon Weekend sebesar 20%");
            System.out.printf("Harga %s setelah mendapatkan potongan yaitu Rp.%d",produk,harga);
        } else {
            System.out.println("\nTidak ada potongan harga");
        }
    }
    
    // behaviour yang berparameter objek
    public void membeli(Ramayana orang) {
        System.out.println("\n");
        // kondisi pembelian barang yang dimiliki dari objek tersebut, dengan membandingkan jumlah uang yang dimiliki objek dan parameter objek
        if (this.getUang() < orang.getUang()) {
            int total = this.getUang() - orang.getHarga();
            if (total > 0) {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Total kembalian : Rp." + total);
            } else if (total == 0) {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Total kembalian : Rp.0");
            } else {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Uang tidak Cukup");
            }
        } else if (orang.getUang() < this.getUang()) {
            int total = this.getUang() - orang.getHarga();
            if (total > 0) {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Total kembalian : Rp." + total);
            } else if (total == 0) {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Total kembalian : Rp.0");
            } else {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Uang tidak Cukup");
            }
        } else {
            int total = this.getUang() - orang.getHarga();
            if (total > 0) {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Total kembalian : Rp." + total);
            } else if (total == 0) {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Total kembalian : Rp.0");
            } else {
                System.out.println("Tranksaksi");
                System.out.println("Membeli produk " + orang.getProduk());
                System.out.println("Uang dimiliki Rp." + uang);
                System.out.println("Uang tidak Cukup");
            }
        }
    }
   
    public void setUang(int uang) {
        this.uang = uang;
    }

    public int getUang() {
        return uang;
    }

    public int getHarga() {
        return harga;
    }

    public String getProduk() {
        return produk;
    }
}
