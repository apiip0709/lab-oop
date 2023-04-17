import java.util.Scanner;
public class BangunRuang{
    public void luas(){
        System.out.println("meanmpilkan luas bangun ruang");
    }
    public void volume(){
        System.out.println("Menampilkan volume bangun ruang");
    }
}

class Kubus extends BangunRuang{
    // private int s,r;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan sisi : ");
        int s = inp.nextInt();
        System.out.println("Luas kubus adalah : " + 6*(s*s));
    }
    public void volume(){
        System.out.print("Masukkan panjang rusuk : ");
        int r = inp.nextInt();
        System.out.println("Volume kubus adalah : " + 12*r);
        super.volume();
    }
}

class Balok extends BangunRuang{
    // private int p,l,t;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan panjang : ");
        int p = inp.nextInt();
        System.out.print("Masukkan lebar : ");
        int l = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        int t = inp.nextInt();
        System.out.println("Luas balok adalah : " + 2*(p*l)+2*(l*t)+2*(p*t));
    }
    public void volume(){
        System.out.print("Masukkan panjang : ");
        int p = inp.nextInt();
        System.out.print("Masukkan lebar : ");
        int l = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        int t = inp.nextInt();
        System.out.print("Volume balok adalah : " + 4 * (p+l+t));
        super.volume();
        inp.close();
    }
}

class Bola extends BangunRuang{
    private double pi = 3.14;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan diameter : ");
        int d = inp.nextInt();
        System.out.println("Luas bola adalah : " + pi*(d*d));
    }
    public void volume(){
        System.out.print("Masukkan jari-jari : ");
        int r = inp.nextInt();
        System.out.println("Volume bola adalah : " + 4/3 * pi * (r*r*r));
        super.volume();
        inp.close();
    }
}

class Tabung extends BangunRuang{
    private double pi = 3.14;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan jari-jari : ");
        int r = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        int t = inp.nextInt();
        System.out.println("Luas tabung adalah : " + 2 * pi * r * (r+t));
    }
    public void volume(){
        System.out.print("Masukkan jari-jari : ");
        int r = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        int t = inp.nextInt();
        System.out.println("Volume tabung adalah : " + pi * (r*r) * t);
        super.volume();
        inp.close();
    }

    public void showMenu(){
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Bola bola = new Bola();
        Tabung tabung = new Tabung();
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
                kubus.luas();
            } else {
                kubus.volume();
            }
            inp.close();
        } else if (pilih2 == 2){
            System.out.println("1. Luas");
            System.out.println("2. Volume");
            System.out.print("Pilih : "); 
            int pilih3 = inp.nextInt();
            if (pilih3 == 1){
                balok.luas();
            } else {
                balok.volume();
            }
            inp.close();
        } else if (pilih2 == 3){
            System.out.println("1. Luas");
            System.out.println("2. Volume");
            System.out.print("Pilih : ");
            int pilih3 = inp.nextInt();
            if (pilih3 == 1){
                bola.luas();
            } else {
                bola.volume();
            }
            inp.close();
        } else if (pilih2 == 4){
            System.out.println("1. Luas");
            System.out.println("2. Volume");
            System.out.print("Pilih : ");
            int pilih3 = inp.nextInt();
            if (pilih3 == 1){
                tabung.luas();
            } else {
                tabung.volume();
            }
            inp.close();
        }
    }
}