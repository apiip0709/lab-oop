import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan judul film : ");
        System.out.print("> ");
        String judul = input.nextLine();
        input.close();

        methodHuruf(judul);
    }
    static void methodHuruf(String film) {
        // mennyimpan string ke dalam array
        String[] bagian = film.split(" ");

        // perulangan untuk mengecek setiap kata agar sesuai dengan format judul
        for (int i=0;i<bagian.length;i++) {
            String next = bagian[i]; // mengambil nilai elemen array dan menyimpan ke dalam variable

            // mengubah setiap huruf pertama menjadi kapital dan mengubah huruf setelahnya menjadi huruf kecil
            next = next.substring(0,1).toUpperCase() + next.substring(1).toLowerCase();
            System.out.print(next+" ");
        }
    }
}
