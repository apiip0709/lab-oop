import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSoal = 7;
        // Menerima input NIM dan menentukan nomor soal berdasarkan NIM
        System.out.print("NIM : " );
        String nim = input.next();

        // Konversi string ke integer, 3 angka nim terakhir
        int nomor = Integer.parseInt(nim.substring(nim.length()-3));

        // Kondisi untuk yang habis dibagi 7 dan tidak
        if (nomor%jumlahSoal==0) {
            int soal = nomor % jumlahSoal+7 ;
            System.out.println("Soal : no " + soal);
         } else {
            int soal = nomor % jumlahSoal ;
            System.out.println("Soal : no " + soal);
        }
        input.close();
    }   
}