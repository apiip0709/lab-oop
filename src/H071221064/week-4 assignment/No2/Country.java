class Country {
    private String name;
    private String capital;
    private String headOfState;
    private double population;
    private String language;

    public Country() {
    }

    public Country(String name, String capital, String headOfState, double population, String language) {
        this.name = name;
        this.capital = capital;
        this.headOfState = headOfState;
        this.population = population;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void displayVoid(){
        System.out.println("Info Negara");
        System.out.println("Nama Negara       : "+getName());
        System.out.println("Capital           : "+getCapital());
        System.out.println("Head Of State     : "+getHeadOfState());
        System.out.println("Banyak Population : "+getPopulation()+" juta orang");
        System.out.println("Language          : "+getLanguage());
    }
}
