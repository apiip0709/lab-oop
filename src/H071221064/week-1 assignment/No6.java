import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan jari-jari : ");
            double r = input.nextDouble();
            double luas = 3.14*r*r;
            
            System.out.printf("Luas lingkaran = %.2f", luas);

        } catch (Exception e) {
            System.out.println("Jari-jari bukan angka");
        }
        input.close();
    }
}
