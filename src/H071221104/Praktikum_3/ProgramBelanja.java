package Semester2.Praktikum.Pertemuan3;
import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    private String nama;
    private int harga;
    private int stok;

    public Barang(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }

    public String toString() {
        return nama + " (Rp" + harga + ") - Stok: " + stok;
    }
}

class Pembeli {
    private int uang;

    public Pembeli(int uang) {
        this.uang = uang;
    }

    public int getUang() {
        return uang;
    }

    public boolean kurangiUang(int harga) {
        if (uang >= harga) {
            uang -= harga;
            return true;
        } else {
            return false;
        }
    }
}

public class ProgramBelanja {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        daftarBarang.add(new Barang("Buku", 10000, 5));
        daftarBarang.add(new Barang("Pensil", 2000, 10));
        daftarBarang.add(new Barang("Penghapus", 3000, 7));
        daftarBarang.add(new Barang("Spidol", 5000, 3));

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan uang Anda: ");
        int uang = input.nextInt();
        Pembeli pembeli = new Pembeli(uang);

        int pilihan;
        do {
            System.out.println("\nDaftar Barang:");
            for (int i = 0; i < daftarBarang.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBarang.get(i));
            }

            System.out.println("0. Selesai belanja");

            System.out.println("\nUang Anda: Rp" + pembeli.getUang());

            System.out.print("Pilih barang yang ingin dibeli: ");
            pilihan = input.nextInt();

            if (pilihan > 0 && pilihan <= daftarBarang.size()) {
                Barang barangDipilih = daftarBarang.get(pilihan - 1);
                if (barangDipilih.getStok() > 0 && pembeli.kurangiUang(barangDipilih.getHarga())) {
                    barangDipilih.kurangiStok(1);
                    System.out.println("Barang berhasil dibeli!");
                } else {
                    System.out.println("Barang tidak dapat dibeli.");
                }
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        System.out.println("\nBarang yang tersedia:");
        for (Barang barang : daftarBarang) {
            System.out.println(barang);
        }
        System.out.println("Uang Anda: Rp" + pembeli.getUang());
    }
}