class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 1;
    }

    @Override
    void describe() {
        System.out.println("Anjing Bulldog tubuh lebar, besar, moncong pesek, berkaki pendek.");
        System.out.println("Memiliki panjang rata-rata "+this.averageLength+" cm");
        System.out.println("Posisi objek sekarang berada di "+this.position);
    }
}
