public class User {
    private String name;
    int balance;
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    public User(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public void showCard(){
        System.out.println("========== CARD ==========");
        System.out.println("Nama : " + getName());
        System.out.println("Balance : " + getBalance());
        System.out.println("========== CARD ==========");
    }
}

