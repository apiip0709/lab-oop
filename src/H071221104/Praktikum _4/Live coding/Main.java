public class Main {
    public static void main(String[]args){


        Player player = new Player ();

        player.setNama("jamal");
        player.setLevel(15);
        player.setHealth(10);
        player.setMana(200);
        player.setExp(50);
     
        player.displayInfo();

        Player player2 = new Player("jamil", 12, 11,300,60);
System.out.println(player2.getNama());
System.out.println(player2.getLevel());
System.out.println(player2.getHealth());
System.out.println(player2.getMana());
System.out.println(player2.getExp());


    }
    
}





    

