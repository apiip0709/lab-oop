import java.util.ArrayList;
import java.util.Random;

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();
  
    public String getWordsToType() {
      return wordsToType;
    }
  
    public ArrayList<Typer> getRaceContestant() {
      return raceContestant;
    }
  
    // Word by Yusuf Syam, Silahkan diubah jika dirasa kurang bijak
    private String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai",
    };
  
    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }
  
    // TODO (4) : Buat method addResult yang mana digunakan untuk menambahkan typer
    // yangtelah selesai (mengetik semua kata), ke dalam list race standing.
    public synchronized void addResult(Result result) {
        raceStanding.add(result);
    }
  
    public void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");
    
        // TODO (5) : Tampilkan klasemen akhir dari kompetisi, dengan format
        // {posisi}. {nama} = {waktu penyelesaian dalam detik} detik
        int index = 1;
  
        for (Result result : raceStanding) {
            System.out.printf("%d. %s - %.2f detik\n", index, result.getName(),
                result.getFinishTime() / 1000.0);
            index += 1;
        }
    }
  
    public void startRace() throws InterruptedException {
        // TODO (6) : jalankan kompetisi
        for (Typer racer : raceContestant) {
            racer.start();
        }
    
        // TODO (7) : selaman semua peserta belum selesai, maka tampilkan
        // SS
        // Setiap 2 detik
        while (raceContestant.size() != raceStanding.size()) {
            Thread.sleep(2000);
            System.out.println("\nTyping Progress ...");
            System.out.println("================\n");
    
            for (Typer racer : raceContestant) {
            System.out.printf("- %s\t=>  %s\n", racer.getBotName(), racer.getWordsTyped());
            System.out.println("-".repeat(100));
            }
    
            System.out.println("\n" + "#".repeat(100));
        }
    
        // TODO (8) : Tampilkan race standing setelah semua typer selesai
        for (Typer racer : raceContestant) {
            racer.join();
        }
    
        printRaceStanding();
    }
}