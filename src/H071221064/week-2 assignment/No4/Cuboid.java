class cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        double volume = height*width*length;
        return volume;
    }
}

public class Cuboid {
    public static void main(String[] args) {
        cuboid cuboid = new cuboid();
        cuboid.height = 15;
        cuboid.width = 10;
        cuboid.length = 30;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
