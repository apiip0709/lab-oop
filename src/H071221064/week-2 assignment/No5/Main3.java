class Alamat{
    String jalan;
    String kota;

    String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    Alamat getAlamat() {
        return alamat;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Jl. Veteran Selatan";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Apiip";
        mahasiswa.nim = "H071221064";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
