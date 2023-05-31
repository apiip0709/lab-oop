import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Name : ");
            String name = input.nextLine();
        
            System.out.print("Umur : ");
            int umur = Integer.parseInt(input.nextLine()); // Konversi string ke integer

            System.out.print("Hobby : ");
            String hobby = input.nextLine();

            System.out.println("Nama saya "+name+", "+umur+" tahun, hobby "+hobby);

        } catch (NumberFormatException e) {
            System.out.println("Umur berupa angka");
        }
        input.close();
    }
}
