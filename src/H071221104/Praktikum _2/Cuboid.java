package Semester2.Praktikum.Pertemuan2;

public class Cuboid {
    double height;
    double width ;
    double length ;
    
    double getVolume(){
        return height * width *  length;
    }
}

class Volume{
    public static void main(String[] args) {
        Cuboid a = new Cuboid();
        a.height = 3;
        a.width =  30;
        a.length = 50;
        System.out.printf("Volume = %.2f", a.getVolume());
    }
}