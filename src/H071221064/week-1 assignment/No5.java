import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input :");
        String tanggal = input.nextLine();
        input.close();

        konversiTanggal(tanggal);
    }
    static void konversiTanggal(String inputTanggal) {
        // menyimpan string ke dalam array
        String[] arrayTanggal = inputTanggal.split("-");

        // index 0 untuk format hari
        String hari = arrayTanggal[0];

        // index 1 untuk bulan, sesuai bulan yang ditentukan
        String bulan = "";
        // struktur kendali untuk memungkinkan memilih satu yang akan dieksekusi 
        switch (arrayTanggal[1]) {
            case "01":
            bulan = "Januari";
            break;
            case "02":
            bulan = "Februari";
            break;
            case "03":
            bulan = "Maret";
            break;
            case "04":
            bulan = "April";
            break;
            case "05":
            bulan = "Mei";
            break;
            case "06":
            bulan = "Juni";
            break;
            case "07":
            bulan = "Juli";
            break;
            case "08":
            bulan = "Agustus";
            break;
            case "09":
            bulan = "September";
            break;
            case "10":
            bulan = "Oktober";
            break;
            case "11":
            bulan = "November";
            break;
            case "12":
            bulan = "Desember";
            break;
        } 

        // index 2 untuk tahun
        String tahun = arrayTanggal[2];
        int tahunInt = Integer.parseInt(tahun); //mengubah tipe data string ke int
        // kondisi untuk menentukan tahun 2000-an atau 1900-an berdasarkan tahun sekarang
        if (tahunInt <= 23) {
            tahun = "20" + tahun;
            System.out.println(hari+" "+bulan+" "+tahun);
        } else {
            tahun = "19" + tahun;
            System.out.println(hari+" "+bulan+" "+tahun);
        }
    } 
}
