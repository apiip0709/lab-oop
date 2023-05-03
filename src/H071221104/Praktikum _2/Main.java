package Semester2.Praktikum.Pertemuan2;
class Alamat{
    String jalan;
    String kota;
    String getAlamatLengkap(){
        return jalan + "," +  kota;
    }
}

class Mahasiswa{
    Alamat alamat;
    String nama;
    String nim;

    String getNama(){
        return nama;
    }
    String getNim(){
        return nim;
    }
    Alamat getAlamat(){
        return alamat;
    }
}

public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Pallangga";
        alamat.kota = "Makassar";

         Mahasiswa mahasiswa = new Mahasiswa();
         mahasiswa.alamat = alamat;
         mahasiswa.nama = "Rafli";
         mahasiswa.nim = "H071221104";

         System.out.println("Nama: " + mahasiswa.getNama());
         System.out.println("NIM: " + mahasiswa.getNim());
         System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
