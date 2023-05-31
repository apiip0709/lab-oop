import java.util.Scanner;

public class No7 {
    static String[] hewan = {"Ayam", "Kucing", "Sapi", "Kambing"};
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kata kunci : ");
        String inputHewan = input.next();

        int indexHewan = findIndex(inputHewan);
        System.out.println(inputHewan+" berada pada index : "+indexHewan);

        input.close();
    }
    static int findIndex(String text) {
        text = text.toLowerCase();
        for (int i = 0; i<hewan.length; i++) {
            String hewan2 = hewan[i];
            hewan2 = hewan2.toLowerCase();
            if (hewan2.equals(text)) {
                return i+1;
            }
        }
        return -1;
    }
}
