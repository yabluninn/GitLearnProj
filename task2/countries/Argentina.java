package task2.countries;

import task2.Country;

public final class Argentina extends Country{
    private final int population = 47000000;
    private final String language = "Spanish";
    private final String continent = "South America";

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

