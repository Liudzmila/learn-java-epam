package main.java.com.epam.learn.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class IterableCountry implements Iterable<Country> {

    private final Country[] countries;

    public IterableCountry(Country... countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }

    @Override
    public Iterator<Country> iterator() {
        return new CountryIterator(this);
    }
}
