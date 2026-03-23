package main.java.com.epam.learn.designpatterns.behavioral.iterator;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {

    private IterableCountry iterableCountry;
    private int index;

    public CountryIterator(IterableCountry iterableCountry) {
        this.iterableCountry = iterableCountry;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        var countryList = iterableCountry.getCountries();
        return index < countryList.length;
    }

    @Override
    public Country next() {
        var countryList = iterableCountry.getCountries();
        if (hasNext()) {
            var country = countryList[index++];
            // remove countries starting with C letter
            if (!country.getName().startsWith("C")) {
                return country;
            } else {
                return next();
            }
        } else {
            return null;
        }
    }
}
