package Semester2.Praktikum.Pertemuan2;
public class produk {
    String nama;
    int id;
    int harga;
    int stok;
    public void cekBarang(){
        System.out.println("Nama produk: " + nama);
        System.out.println("Id: " + id);
        System.out.println("Harga produk: " + harga);
        System.out.println("Stok: " + stok);
    }
    public void cekStok(){
        if(stok > 0){
            System.out.println("Stok tersedia");
        } else { System.out.println("Stok tidak tersedia");

        }
    }
}
class cek{
    public static void main(String[] args) {
        produk a = new produk();
        produk b = new produk();
        a.id = 1234;
        a.nama = "Yakult";
        a.stok = 0;
        a.harga = 2500;
        b.id = 1334;
        b.nama = "Nabati";
        b.stok = 5;
        b.harga = 5000;
        a.cekBarang();
        a.cekStok();
        b.cekBarang();
        b.cekStok();
    }
}