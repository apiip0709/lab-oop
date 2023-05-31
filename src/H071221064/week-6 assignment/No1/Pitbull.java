class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 3;
    }

    @Override
    void describe() {
        System.out.println("Anjing pitbull memiliki tubuh yang berotot dan gagah.");
        System.out.println("Memiliki panjang rata-rata "+this.averageLength+" cm");
        System.out.println("Posisi objek sekarang berada di "+this.position);
    }
}