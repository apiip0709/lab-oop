import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      TypeRacer typeRacer = new TypeRacer();
      typeRacer.setNewWordsToType();
      System.out.println("|| Text to Type ||");
      System.out.println("\"" + typeRacer.getWordsToType() + "\"");
  
      Typer[] typers = new Typer[3];
  
      typers[0] = new Typer("Bot Mansur", 40, typeRacer);
      typers[1] = new Typer("Bot ToKu", 32, typeRacer);
      typers[2] = new Typer("Bot Yukiao", 30, typeRacer);
  
      typeRacer.getRaceContestant().addAll(Arrays.asList(typers));
  
      typeRacer.startRace();
    }
  }