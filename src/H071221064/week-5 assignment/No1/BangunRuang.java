import java.util.Scanner;
public class BangunRuang{
    
    protected double luasPermukaan,volume;
    public void luasPermukaan(){
        System.out.println("Menampilkan luasPermukaan : " + luasPermukaan);
    }
    public void volume(){
        System.out.println("Menampilkan volume : " + volume);
    }
}

class Kubus extends BangunRuang{
    private int s,r;

    Scanner inp = new Scanner(System.in);
    public void luasPermukaan(){
        System.out.print("Masukkan sisi : ");
        s = inp.nextInt();
        luasPermukaan = 6*(s*s);
        super.luasPermukaan();
    }
    public void volume(){
        System.out.print("Masukkan panjang rusuk : ");
        r = inp.nextInt();
        volume = 12*r;
        super.volume();
    }
}

class Balok extends BangunRuang{
    private int p,l,t;

    Scanner inp = new Scanner(System.in);
    public void luasPermukaan(){
        System.out.print("Masukkan panjang : ");
        p = inp.nextInt();
        System.out.print("Masukkan lebar : ");
        l = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = inp.nextInt();
        luasPermukaan = 2*(p*l)+2*(l*t)+2*(p*t);
        super.luasPermukaan();
    }
    public void volume(){
        System.out.print("Masukkan panjang : ");
        p = inp.nextInt();
        System.out.print("Masukkan lebar : ");
        l = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = inp.nextInt();
        volume = 4 * (p+l+t); 
        super.volume();
    }
}

class Bola extends BangunRuang{
    double pi = 3.14;
    private int d,r;

    Scanner inp = new Scanner(System.in);
    public void luasPermukaan(){
        System.out.print("Masukkan diameter : ");
        d = inp.nextInt();
        luasPermukaan = pi*(d*d);
        super.luasPermukaan();
    }
    public void volume(){
        System.out.print("Masukkan jari-jari : ");
        r = inp.nextInt();
        volume = 4/3 * pi * (r*r*r);       
        super.volume();
    }
}

class Tabung extends BangunRuang{
    double pi = 3.14;
    private int r,t;

    Scanner inp = new Scanner(System.in);
    public void luasPermukaan(){
        System.out.print("Masukkan jari-jari : ");
        r = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = inp.nextInt();
        luasPermukaan = 2 * pi * r * (r+t);
        super.luasPermukaan();
    }
    public void volume(){
        System.out.print("Masukkan jari-jari : ");
        r = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = inp.nextInt();
        volume = pi * (r*r) * t;
        super.volume();
    }
}