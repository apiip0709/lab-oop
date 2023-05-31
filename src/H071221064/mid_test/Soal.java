// class MataKuliah {
//     private String kodeMatkul;
//     private String namaMatkul;
//     private int sks;

//     public MataKuliah(String kodeMatkul, String namaMatkul, int sks) {
//         this.kodeMatkul = kodeMatkul;
//         this.namaMatkul = namaMatkul;
//         this.sks = sks;
//     }
    
//     public String getKodeMatkul() {
//         return kodeMatkul;
//     }    
//     public void setKodeMatkul(String kodeMatkul) {
//         this.kodeMatkul = kodeMatkul;
//     }
//     public String getNamaMatkul() {
//         return namaMatkul;
//     }
//     public void setNamaMatkul(String namaMatkul) {
//         this.namaMatkul = namaMatkul;
//     }
//     public int getSks() {
//         return sks;
//     }
//     public void setSks(int sks) {
//         this.sks = sks;
//     }
// }

// class Mahasiswa {
//     private String nama;
//     private String nim;

//     public Mahasiswa(String nama, String nim) {
//         this.nama = nama;
//         this.nim = nim;
//     }
    
//     public String getNama() {
//         return nama;
//     }
//     public void setNama(String nama) {
//         this.nama = nama;
//     }
//     public String getNim() {
//         return nim;
//     }
//     public void setNim(String nim) {
//         this.nim = nim;
//     }
// }

// class Nilai {
//     private MataKuliah mataKuliah;
//     private int nilaiTugas;

//     public Nilai(MataKuliah mataKuliah, int nilaiTugas) {
//         this.mataKuliah = mataKuliah;
//         this.nilaiTugas = nilaiTugas;
//     }
    
//     public MataKuliah getMataKuliah() {
//         return mataKuliah;
//     }
//     public void setMataKuliah(MataKuliah mataKuliah) {
//         this.mataKuliah = mataKuliah;
//     }
//     public int getNilaiTugas() {
//         return nilaiTugas;
//     }
//     public void setNilaiTugas(int nilaiTugas) {
//         this.nilaiTugas = nilaiTugas;
//     }

//     public void showDetail() {
//         System.out.println("Nilai Tugas : " + nilaiTugas);
//     }
// }

// class NilaiKelas extends Nilai {
//     private int nilaiUjian;

//     public NilaiKelas(MataKuliah mataKuliah, int nilaiTugas, int nilaiUjian) {
//         super(mataKuliah, nilaiTugas);
//         this.nilaiUjian = nilaiUjian;
//     }
    
//     public int getNilaiUjian() {
//         return nilaiUjian;
//     }
//     public void setNilaiUjian(int nilaiUjian) {
//         this.nilaiUjian = nilaiUjian;
//     }

//     public void showDetail() {
//         super.showDetail();
//         System.out.println("Nilai Final : "+ nilaiUjian);
//     }
// }

// class NilaiPraktikum extends Nilai {
//     private int nilaiPraktikum;

//     public NilaiPraktikum(MataKuliah mataKuliah, int nilaiTugas, int nilaiPraktikum) {
//         super(mataKuliah, nilaiTugas);
//         this.nilaiPraktikum = nilaiPraktikum;
//     }
    
//     public int getNilaiPraktikum() {
//         return nilaiPraktikum;
//     }
//     public void setNilaiPraktikum(int nilaiPraktikum) {
//         this.nilaiPraktikum = nilaiPraktikum;
//     }

//     public void showDetail() {
//         super.showDetail();
//         System.out.println("Nilai Ujian Praktikum : "+ nilaiPraktikum);
//     }
// }

// class HelperMid {
//     static void showMyData() {
//         System.out.println("DATA DIRI");
//         System.out.println("Nama    : A. Afif Alhaq");
//         System.out.println("NIM     : H071221064");
//         System.out.println("Kelas   : B");
//         System.out.println("Paket   : A");
//     }

//     static void showFeedbackLab() {
//         System.out.println("-".repeat(25));
//         System.out.println("Kritik dan Saran");
//         System.out.println("-".repeat(25));
//         String kalimat = "Untuk kritik tidak ada dan saran sukses selalu";
//         System.out.println(HelperMid.cutLineString(kalimat));
//         // System.out.println("Untuk kritik tidak ada dan saran sukses selalu");
//     }
    
//     static String cutLineString(String input) {
//         String[] kata = input.split(" ");
//         StringBuilder baru = new StringBuilder();
//         int count = 0;
//         for (String i : kata) {
//             baru.append(i + " ");
//             count++;
//             if (count == 3) {
//                 baru.append("\n");
//                 count = 0;
//             }
//         }
//         return baru.toString().trim();
//     }
// }


