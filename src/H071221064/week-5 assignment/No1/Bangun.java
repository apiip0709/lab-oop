import java.util.Scanner;
public class Bangun {
    Kubus kubus = new Kubus();
    Balok balok = new Balok();
    Bola bola = new Bola();
    Tabung tabung = new Tabung();
    Persegi persegi = new Persegi();
    PersegiPanjang persegiPanjang = new PersegiPanjang();
    Lingkaran lingkaran = new Lingkaran();
    Segitiga segitiga = new Segitiga();
    Trapesium trapesium = new Trapesium();
    int pilih,pilih2,pilih3;
    public void showMenu(){
        Scanner inp = new Scanner(System.in);
        System.out.println("1. ==== BANGUN RUANG ====");
        System.out.println("2. ==== BANGUN DATAR ====");
        System.out.print("Pilih : ");
        int pilih = inp.nextInt();
        if (pilih == 1){
            System.out.println("==== BANGUN RUANG ====");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.print("Pilih : ");
            int pilih2 = inp.nextInt();
            if (pilih2 == 1){
                System.out.println("1. Luas");
                System.out.println("2. Volume");
                System.out.print("Pilih : ");
                int pilih3 = inp.nextInt();
                if (pilih3 == 1){
                    kubus.luasPermukaan();
                } else {
                    kubus.volume();
                }               
            } else if (pilih2 == 2){
                System.out.println("1. Luas");
                System.out.println("2. Volume");
                System.out.print("Pilih : "); 
                int pilih3 = inp.nextInt();
                if (pilih3 == 1){
                    balok.luasPermukaan();
                } else {
                    balok.volume();
                }               
            } else if (pilih2 == 3){
                System.out.println("1. Luas");
                System.out.println("2. Volume");
                System.out.print("Pilih : ");
                int pilih3 = inp.nextInt();
                if (pilih3 == 1){;
                    bola.luasPermukaan();
                } else {
                    bola.volume();
                }               
            } else if (pilih2 == 4){
                System.out.println("1. Luas");
                System.out.println("2. Volume");
                System.out.print("Pilih : ");
                int pilih3 = inp.nextInt();
                if (pilih3 == 1){
                    tabung.luasPermukaan();
                } else {
                    tabung.volume();
                }
                
            }        
        } else if(pilih == 2){
            System.out.println("==== BANGUN DATAR ====");
            System.out.println("1. PERSEGI");
            System.out.println("2. PERSEGI PANJANG");
            System.out.println("3. LINGKARAN");
            System.out.println("4. SEGITIGA");
            System.out.println("5. TRAPESIUM");
            System.out.print("Pilih : ");
            int pilih2 = inp.nextInt();
            if (pilih2 == 1){
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Pilih : ");
                int pilih3 = inp.nextInt();
                if (pilih3 == 1){
        ;
                    persegi.luas();
                } else {
                    persegi.keliling();
                }
            } else if (pilih2 == 2){
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Pilih : ");
                int pilih3 = inp.nextInt();
                if (pilih3 == 1){
                    persegiPanjang.luas();
                } else {
                    persegiPanjang.keliling();
                }
            } else if (pilih2 == 3){
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Pilih : ");
                int pilih3 = inp.nextInt();
                if (pilih3 == 1){
                    lingkaran.luas();
                } else {
                    lingkaran.keliling();
                }
            } else if (pilih2 == 4){
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Pilih : ");
                int pilih3 = inp.nextInt();
                if (pilih3 == 4){
                    segitiga.luas();
                } else {
                    segitiga.keliling();
                }
            } else if (pilih2 == 5){
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Pilih : ");
                int pilih3 = inp.nextInt();
                if (pilih3 == 1){
                    trapesium.luas();
                } else 
                    trapesium.keliling();
                } 
            } 
        inp.close();       
        }     
    public static void main(String[] args) {
        Bangun bangun = new Bangun();
        bangun.showMenu();
    }
}
