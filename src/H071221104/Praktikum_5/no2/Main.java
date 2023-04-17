public class Main {
    public static void main(String[] args) {
        Sisfo sisfo = new Sisfo();
        Kordinator kordinator = new Kordinator();
        Staf staf = new Staf();
        Pengurus pengurus = new Pengurus();
        kordinator.suara();
        pengurus.suara();
        staf.suara();
        sisfo.slogan();
        kordinator.slogan();
        staf.slogan();
        
    }
}