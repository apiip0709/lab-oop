class HelperMid {
    static void showMyData() {
        System.out.println("DATA DIRI");
        System.out.println("Nama    : A. Afif Alhaq");
        System.out.println("NIM     : H071221064");
        System.out.println("Kelas   : B");
        System.out.println("Paket   : A");
    }

    static void showFeedbackLab() {
        System.out.println("-".repeat(25));
        System.out.println("Kritik dan Saran");
        System.out.println("-".repeat(25));
        String kalimat = "Untuk kritik tidak ada dan saran sukses selalu";
        System.out.println(HelperMid.cutLineString(kalimat));
        // System.out.println("Untuk kritik tidak ada dan saran sukses selalu");
    }
    
    static String cutLineString(String input) {
        String[] kata = input.split(" ");
        StringBuilder baru = new StringBuilder();
        int count = 0;
        for (String i : kata) {
            baru.append(i + " ");
            count++;
            if (count == 3) {
                baru.append("\n");
                count = 0;
            }
        }
        return baru.toString().trim();
    }
}