package Semester2.Praktikum.Pertemuan2;

public class no1 {
    String nama;
    int health;
    int mana;
    int att;
    int armor;
}
class Hero {
    //Method
    static void detailHero() {
        //Atribut
        no1 bimasakti = new no1();
        bimasakti.nama = "Bimasakti";
        bimasakti.health = 300;
        bimasakti.mana = 100;
        bimasakti.att = 50;
        bimasakti.armor = 200;

        System.out.println("Nama Hero: " + bimasakti.nama);
        System.out.println("Health: " + bimasakti.health);
        System.out.println("Mana: " + bimasakti.mana);
        System.out.println("Attack: " + bimasakti.att);
        System.out.println("Armor: " + bimasakti.armor);
    }
    static void slogan(){
        System.out.println("'Akulah lambang dari kebenaran' ");
    }
    //Maiin Method
    public static void main(String[] args) {
        detailHero();
        slogan();
    }
}

