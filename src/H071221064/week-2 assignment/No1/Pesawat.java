public class Pesawat {
    String nama;
    int jumlahPenumpang;
    boolean sudahTerbang;

    public void jenis(String jenis) {
        nama = jenis;
    }

    public void terbang() {
        if (!sudahTerbang) {
            System.out.println(nama + " lepas landas...");
            sudahTerbang = true;
        } else {
            System.out.println(nama + " sudah terbang...");
        }
    }

    public void tambahPenumpang(int jumlah) {
        if (jumlahPenumpang + jumlah <= 200) {
            jumlahPenumpang += jumlah+2;
            System.out.println("Penumpang " + nama + " bertambah " + jumlah + " orang");
        } else {
            System.out.println("Kapasitas " + nama + " sudah penuh...");
        }
    }

    public void info() {
        System.out.println("Pesawat " + nama + " dengan total " + jumlahPenumpang + " penumpang");
    }
}