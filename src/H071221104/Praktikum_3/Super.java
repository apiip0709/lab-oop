package Semester2.Praktikum.Pertemuan3;
public class Super {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.role = "Assasin";
        hero.type = "Attacker";

        SungJin sungJin = new SungJin("Sung Jin Wo", 150, 500);
        sungJin.roletype = hero;

        //Sebelum menggunakan spesial skill
        System.out.println("Before:");
        sungJin.getStat();
        System.out.println("Type: " + hero.getRoleType());

        //Setelah menggunakan spesial skill
        System.out.println("\nAfter: ");
        sungJin.SpesialSkill();
        sungJin.getStat();
        System.out.println("Type: " + hero.getRoleType());
    }
}
class Hero{
    String role;
    String type;
    String getRoleType(){
        return role + ", " + type;
    }
}
class SungJin{
    Hero roletype;
    String nama;
    int power;
    int health;
    public SungJin() {}

    public SungJin(String nama) {
        this.nama = nama;
    }
    public SungJin(String nama, int power, int health){
        this.nama = nama;
        this.power = power;
        this.health = health;
    }

    public void getStat(){
        System.out.println("nama: " + nama);
        System.out.println("Power: " + power);
        System.out.println("Health: " + health);
    }
    public void SpesialSkill(){
        this.power += 50;
        this.health += 100;
    }
}
