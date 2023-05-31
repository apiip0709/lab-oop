public class Main {
    public static void main(String[] args) {
        Character[] characters = new Character[5]; 
        characters[0] = new Fighter("Alpha",4);
        characters[1] = new Mage("Witch",4);
        characters[2] = new Fighter("Hercules",6);
        characters[3] = new Fighter("Hilda",8);
        characters[4] = new Mage("Warlock",6);
        
        for (int i = 0;i < characters.length;i++) {
            Type type = new Type();
            type.printAttack(characters[i]);
        }
    }
}
