class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        this.position += 2;
    }

    @Override
    void describe() {
        System.out.println("Anjing Siberian Husky bulunya tebal dan panjang.");
        System.out.println("Memiliki panjang rata-rata "+this.averageLength+" cm");
        System.out.println("Posisi objek sekarang berada di "+this.position);
    }
}