public class Main {
    public static void main(String[] args) {
        Ramayana orang = new Ramayana("Baju", 200000, 200000);
        Ramayana orang2 = new Ramayana("Celana", 100000, 180000);
        
        orang.setAlamat("Jalan Raya");
        orang.lokasi();
        orang.produk();
        orang2.produk();

        orang.event("ramadhan");
        orang2.event("weekend");
        
        orang.membeli(orang);
        orang2.membeli(orang2);
        
        orang.membeli(orang2);
        orang2.membeli(orang);

    }
}
