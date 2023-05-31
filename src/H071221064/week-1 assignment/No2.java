import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        int bulat = 0;
        int desimal = 0;

        System.out.print("");
        String barisInput = input.nextLine();

        // menyimpan string ke dalam array
        String[] angkaString = barisInput.split(" ");

        // perulangan mengecek satu persatu dalam array apakah termasuk bilangan bulat atau desimal
        for (int i=0; i < angkaString.length; i++)
            try {
                double angka = Double.parseDouble(angkaString[i]); // setiap isi array dicek dan diubah ke dalam bentuk desimal
                // kondisi menentukan bilangan tersebut bulat atau desimal
                if (angka % 1 == 0) {
                    bulat++;
                } else {
                    desimal++;
                }
            } catch (Exception e) {
                System.out.println("Bukan angka");
                System.exit(0);
            }
        System.out.println(bulat + " bilangan bulat");
        System.out.println(desimal + " bilangan desimal");
        input.close();
    }
}   

