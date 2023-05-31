class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
    }

    @Override
    void describe() {
        System.out.println("Anjing German Shepherd tubuh yang agak memanjang dan struktur tulang yang solid.");
        System.out.println("Memiliki panjang rata-rata "+this.averageLength+" cm");
        System.out.println("Posisi objek sekarang berada di "+this.position);
    }
}