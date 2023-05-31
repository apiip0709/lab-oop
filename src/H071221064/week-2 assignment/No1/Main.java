public class Main {
    public static void main(String[] args) {
        Pesawat pesawat1 = new Pesawat();
        pesawat1.jenis("Garuda Indonesia");
        pesawat1.tambahPenumpang(50);
        pesawat1.info();
        pesawat1.terbang();
        pesawat1.terbang();
    }
}