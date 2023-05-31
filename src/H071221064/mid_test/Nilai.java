class Nilai {
    private MataKuliah mataKuliah;
    private int nilaiTugas;

    public Nilai(MataKuliah mataKuliah, int nilaiTugas) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
    }
    
    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }
    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public int getNilaiTugas() {
        return nilaiTugas;
    }
    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public void showDetail() {
        System.out.println("Nilai Tugas : " + nilaiTugas);
    }
}

class NilaiKelas extends Nilai {
    private int nilaiUjian;

    public NilaiKelas(MataKuliah mataKuliah, int nilaiTugas, int nilaiUjian) {
        super(mataKuliah, nilaiTugas);
        this.nilaiUjian = nilaiUjian;
    }
    
    public int getNilaiUjian() {
        return nilaiUjian;
    }
    public void setNilaiUjian(int nilaiUjian) {
        this.nilaiUjian = nilaiUjian;
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Nilai Final : "+ nilaiUjian);
    }
}

class NilaiPraktikum extends Nilai {
    private int nilaiPraktikum;

    public NilaiPraktikum(MataKuliah mataKuliah, int nilaiTugas, int nilaiPraktikum) {
        super(mataKuliah, nilaiTugas);
        this.nilaiPraktikum = nilaiPraktikum;
    }
    
    public int getNilaiPraktikum() {
        return nilaiPraktikum;
    }
    public void setNilaiPraktikum(int nilaiPraktikum) {
        this.nilaiPraktikum = nilaiPraktikum;
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Nilai Ujian Praktikum : "+ nilaiPraktikum);
    }
}