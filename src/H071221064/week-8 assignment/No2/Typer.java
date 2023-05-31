class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;
  
    public Typer(String botName, double wpm, TypeRacer typeRacer) {
      this.botName = botName;
      this.wpm = wpm;
      this.wordsTyped = "";
      this.typeRacer = typeRacer;
    }
  
    public void setBotName(String botName) {
      this.botName = botName;
    }
  
    public void setWpm(int wpm) {
      this.wpm = wpm;
    }
  
    public void addWordTyped(String newWordsTyped) {
      this.wordsTyped += newWordsTyped + " ";
    }
  
    public String getWordsTyped() {
      return wordsTyped;
    }
  
    public String getBotName() {
      return botName;
    }
  
    public double getWpm() {
      return wpm;
    }
  
    @Override
    public void run() {
  
      String[] wordsToType = typeRacer.getWordsToType().split(" ");
  
      // TODO (1): Buatlah variable howLongToType yang memuat waktu yang diperlukan
      // typer
      // untuk menulis 1 kata dalam milisecond
      int howLongToType = (int) Math.floor(((60 / this.wpm)) * 1000);
  
      // TODO (2): Buatlah perulangan untuk menambahkan kata dengan method
      // addWordToTyped setelah interval waktu sebanyak howLongToType
      for (int i = 0; i < wordsToType.length; i++) {
        try {
          Thread.sleep(howLongToType);
          addWordTyped(wordsToType[i]);
        } catch (InterruptedException e) {
          System.out.println("Error: " + this.botName);
        }
      }
  
      this.addWordTyped("(selesai)");
      // TODO (3): menambahkan typer yang telah selesai mengetik semua kata ke list
      // typeRaceTabel yang ada di class typeRacer
      typeRacer.addResult(new Result(botName, howLongToType * wordsToType.length));
    }
}