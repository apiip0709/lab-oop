public class Player{
     String nama;
     int level;
     int health;
     int mana;
     int exp;

    public Player(String nama, int level, int health, int mana, int exp) {
        this.nama = nama;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.exp = exp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public Player(){}

    public void displayInfo(){
        System.out.println(nama);
        System.out.println(level);
        System.out.println(health);
        System.out.println(mana);
        System.out.println(exp);

        
    } 


}