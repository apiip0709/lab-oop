import java.util.Scanner;
public class BangunDatar{
    public void luas(){
        System.out.println("Menampilkan luas bangun datar");
    }
    public void keliling(){
        System.out.println("menampilkan keliling bangun datar");
    }
}

class Persegi extends BangunDatar{
    int s;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan panjang sisi : ");
        int s = inp.nextInt();
        System.out.println("Luas persegi adalah : " + s*s);
    }

    public void keliling(){
        System.out.print("Masukkan panjang sisi : ");
        int s = inp.nextInt();
        System.out.println("Keliling persegi adalah : " + 4*s);
        super.keliling();
        inp.close();
    }
}

class PersegiPanjang extends BangunDatar{
    int p,l;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.println("Masukkan panjang : ");
        int p = inp.nextInt();
        System.out.println("Masukkan lebar : ");
        int l = inp.nextInt();
        System.out.println("Luas Persegi Panjang adalah : " + p*l);
    }
    public void keliling(){
        System.out.println("Masukkan panjang : ");
        int p = inp.nextInt();
        System.out.println("Masukkan lebar : ");
        int l = inp.nextInt();
        System.out.println("Keliling Persegi panjang adalah : " + (2*p) + (2*l));
        super.keliling();
        inp.close();
    }
}

class Lingkaran extends BangunDatar{
    double pi = 3.14;
    int r,d;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.println("Masukkan Jari-jari : ");
        int r = inp.nextInt();
        System.out.println("Luas lingkaran : " + pi*r*r);
    }

    public void keliling(){
        System.out.println("Masukkan diameter : " );
        int d = inp.nextInt();
        System.out.println("Keliling lingkarang adalah : " + pi*d);
        super.keliling();
        inp.close();
    }
}

class Segitiga extends BangunDatar{
    int a,t,s1,s2,s3;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.println("Masukkan alas : ");
        int a = inp.nextInt();
        System.out.println("Masukkan tinggi : ");
        int t = inp.nextInt();
        System.out.println("Luas segitiga adalah : " + 0.5*a*t);
    }
    public void keliling(){
        System.out.println("Masukkan sisi 1 : ");
        int s1 = inp.nextInt();
        System.out.println("Masukkan sisi 2 : ");
        int s2 =  inp.nextInt();
        System.out.println("Masukkan sisi 3 : ");
        int s3 = inp.nextInt();
        System.out.println("Keliling segitiga adalah : " + s1+s2+s3);
        super.keliling();
        inp.close();
    }
}

class Trapesium extends BangunDatar{
    int a,b,c,d,t,s1,s2,s3,s4;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.println("Masukkan sisi a : ");
        int a = inp.nextInt();
        System.out.println("Masukkan sisi b : ");
        int b = inp.nextInt();
        System.out.println("Masukkan tinggi : ");
        int t = inp.nextInt();
        System.out.println("Luas trapesium adalah : " + 0.5*t*(a+b));
    }
    public void keliling(){
        System.out.println("Masukkan sisi 1 : ");
        int s1 = inp.nextInt();
        System.out.println("Masukkan sisi 2 : ");
        int s2 =  inp.nextInt();
        System.out.println("Masukkan sisi 3 : ");
        int s3 = inp.nextInt();
        System.out.println("Masukkan sisi 4 : ");
        int s4 = inp.nextInt();
        System.out.println("Keliling trapesium adalah : " + (s1+s2+s3+s4));
        super.keliling();
    }
}
