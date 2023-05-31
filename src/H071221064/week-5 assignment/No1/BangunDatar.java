import java.util.Scanner;
public class BangunDatar{
    protected double luas,keliling;
    public void luas(){
        System.out.println("Menampilkan luas : "+ luas);
    }
    public void keliling(){
        System.out.println("menampilkan keliling : "+ keliling);
    }
}

class Persegi extends BangunDatar{
    int s;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan panjang sisi : ");
        s = inp.nextInt();
        luas = s*s;
        super.luas();
    }

    public void keliling(){
        System.out.print("Masukkan panjang sisi : ");
        s = inp.nextInt();
        keliling = 4*s;
        super.keliling();
    }
}

class PersegiPanjang extends BangunDatar{
    int p,l;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan panjang : ");
        p = inp.nextInt();
        System.out.print("Masukkan lebar : ");
        l = inp.nextInt();
        luas = p*l;
        super.luas();
    }
    public void keliling(){
        System.out.print("Masukkan panjang : ");
        p = inp.nextInt();
        System.out.print("Masukkan lebar : ");
        l = inp.nextInt();
        keliling = (2*p) + (2*l);
        super.keliling();
    }
}

class Lingkaran extends BangunDatar{
    int r,d;
    double pi = 3.14;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan Jari-jari : ");
        r = inp.nextInt();
        luas = pi*r*r;
        super.luas();
    }

    public void keliling(){
        System.out.print("Masukkan diameter : " );
        d = inp.nextInt();
        keliling = pi*d;
        super.keliling();
    }
}

class Segitiga extends BangunDatar{
    int a,t,s1,s2,s3;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan alas : ");
        a = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = inp.nextInt();
        luas = 0.5*a*t;
        super.luas();
    }
    public void keliling(){
        System.out.print("Masukkan sisi 1 : ");
        s1 = inp.nextInt();
        System.out.print("Masukkan sisi 2 : ");
        s2 =  inp.nextInt();
        System.out.print("Masukkan sisi 3 : ");
        s3 = inp.nextInt();
        keliling = s1+s2+s3;
        super.keliling();
    }
}

class Trapesium extends BangunDatar{
    int a,b,t,s1,s2,s3,s4;
    Scanner inp = new Scanner(System.in);
    public void luas(){
        System.out.print("Masukkan sisi a : ");
        a = inp.nextInt();
        System.out.print("Masukkan sisi b : ");
        b = inp.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = inp.nextInt();
        luas = 0.5*t*(a+b);
        super.luas();
    }
    public void keliling(){
        System.out.print("Masukkan sisi 1 : ");
        s1 = inp.nextInt();
        System.out.print("Masukkan sisi 2 : ");
        s2 =  inp.nextInt();
        System.out.print("Masukkan sisi 3 : ");
        s3 = inp.nextInt();
        System.out.print("Masukkan sisi 4 : ");
        s4 = inp.nextInt();
        keliling = (s1+s2+s3+s4);
        super.keliling();
    }
}
