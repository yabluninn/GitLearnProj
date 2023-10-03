package task2.countries;

import task2.Country;

public final class Italy extends Country{
    private final int population = 58000000;
    private final String language = "Italian";
    private final String continent = "Eurasia";

    public int getPopulation(){
        return this.population;
    }

    public String getLanguage(){
        return this.language;
    }

    public String getContinent(){
        return this.continent;
    }
}
