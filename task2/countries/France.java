package task2.countries;

import task2.Country;

public final class France extends Country{
    private final int population = 67000000;
    private final String language = "French";
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
