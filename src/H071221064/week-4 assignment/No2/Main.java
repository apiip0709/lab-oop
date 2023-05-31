public class Main {
    public static void main(String[] args) {
        Country country1 = new Country();
        country1.setName("Indonesia");
        country1.setCapital("Jakarta");
        country1.setHeadOfState("Presiden");
        country1.setPopulation(270.20);
        country1.setLanguage("Bahasa");

        country1.displayVoid();
        
        System.out.println("-----------------------------------");
        Country country2 = new Country("Malaysia","Kuala Lumpur","Raja",32.770,"Melayu");
        System.out.println("Info Negara");
        System.out.println("Nama Negara       : "+country2.getName());
        System.out.println("Capital           : "+country2.getCapital());
        System.out.println("Head Of State     : "+country2.getHeadOfState());
        System.out.println("Banyak Population : "+country2.getPopulation()+" juta orang");
        System.out.println("Language          : "+country2.getLanguage());

        SelfUtils.displaySelfData();
    }
}
