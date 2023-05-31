public class Main2 {
    public static void main(String[] args) {
        Toko item = new Toko();
        item.idBarang(123);
        item.cekStok("baju");
        item.hargaBarang(50000);
        item.info();
        item.getStok();
    }
}
