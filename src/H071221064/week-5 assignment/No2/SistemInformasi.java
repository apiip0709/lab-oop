// kelas induk
class Anggota {
    protected String nama;
    protected int umur;

    public Anggota(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanProfil() {
        System.out.println("-------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + umur);
    }

    public void mars(){
        System.out.println("Kebangsaan...");
    }
}

// kelas anak untuk pengurus inti
class PengurusInti extends Anggota {
    private String jabatan;

    public PengurusInti(String nama, int umur, String jabatan) {
        super(nama, umur);
        this.jabatan = jabatan;
    }

    public void tampilkanProfil() {
        super.tampilkanProfil();
        System.out.println("Jabatan: " + jabatan);
    }

    public void mars() {
        super.mars();
    }
}

// kelas anak untuk koordinator bidang
class KoordinatorBidang extends Anggota {
    private String bidang;

    public KoordinatorBidang(String nama, int umur, String bidang) {
        super(nama, umur);
        this.bidang = bidang;
    }

    public void tampilkanProfil() {
        super.tampilkanProfil();
        System.out.println("Bidang: " + bidang);
    }

    public void mars() {
        super.mars();
    }
}

// kelas anak untuk Kertua Umum, mewarisi dari kelas pengurus inti
class KetuaUmum extends PengurusInti {
    String visi;
    public KetuaUmum(String nama, int umur, String jabatan, String visi){
        super(nama, umur, jabatan);
        this.visi = visi;
    }

    public void tampilkanProfil(){
        super.tampilkanProfil();
        System.out.println("Visi : "+visi);
    }

    public void ciri() {
        System.out.println("Tinggi Tampan");
    }
}

// kelas anak untuk humas, mewarisi dari kelas koordinator bidang
class Humas extends KoordinatorBidang {
    String deskripsi;

    public Humas(String nama, int umur, String bidang, String deskripsi){
        super(nama, umur, bidang);
        this.deskripsi = deskripsi;
    }

    public void tampilkanProfil(){
        super.tampilkanProfil();
        System.out.println("Deskripsi : "+ deskripsi);
    }

    public void jumlahAnggota(){
        System.out.println("50 orang");
    }
}

public class SistemInformasi {
    public static void main(String[] args) {
        PengurusInti pengurus = new PengurusInti("Ibu B", 19, "Bendahara");
        KoordinatorBidang koor = new KoordinatorBidang("Korpeng", 19, "Pengkaderan");
        KetuaUmum ketuaUmum = new KetuaUmum("Ketum", 20, "Ketua Umum", "2x+benar");
        Humas humas = new Humas("KoorHum", 19, "Hubungan Masyarakat", "Media sosial");

        System.out.println("Informasi Pengurus Inti");
        ketuaUmum.tampilkanProfil();
        pengurus.tampilkanProfil();

        System.out.println("\nInformasi Koordinator Bidang");
        koor.tampilkanProfil();
        humas.tampilkanProfil();
    }
}