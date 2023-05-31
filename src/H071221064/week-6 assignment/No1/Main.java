public class Main {
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone(1000, "Samsung");
        Car avanza = new Car(5, "Hitam", 200);
        Pitbull pitbull = new Pitbull(0, 50);

        pitbull.move();
        pitbull.describe();
        System.out.println("-".repeat(35));
        samsung.move();
        System.out.println("-".repeat(35));
        avanza.move();
    }
}