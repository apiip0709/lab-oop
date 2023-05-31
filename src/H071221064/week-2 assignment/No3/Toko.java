public class Toko {
    int id;
    String nama;
    boolean stok;
    double harga;

    public void idBarang(int idBarang) {
        id = idBarang;
    }

    public void hargaBarang(int hargaBarang) {
        harga = hargaBarang;
    }

    public void info() {
        System.out.printf("ID%d dengan nama barang %s tersedia dengan harga RP.%.2f\n",id,nama,harga);
    }

    public void cekStok(String namaBarang) {
        nama = namaBarang;
        String[] barang = {"baju", "celana", "sepatu", "sendal"};
        for (int i = 0; i<barang.length; i++) {
            String barang2 = barang[i];
            nama = nama.toLowerCase();
            if (barang2.equals(nama)) {
                stok = true;
                break;
            } else {
                stok = false;
            }
        }
    }

    public void getStok() {
        if (stok == true) {
            System.out.println("Barang tersedia");
        } else {
            System.out.println("Maaf sudah habis");
        }
    }
}

