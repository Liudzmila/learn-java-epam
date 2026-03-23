package main.java.com.epam.learn.designpatterns.behavioral.iterator;

public class App {

    public static void main(String[] args) {

        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var iterableCountry = new IterableCountry(india, poland, nigeria, canada, argentina);
        var countryIterator = iterableCountry.iterator();
        while (countryIterator.hasNext()) {
            var country = countryIterator.next();
            // can throw NPE if the last element was removed by a filter in the CountryIterator.next() method
            System.out.println(country.getName());
        }
    }
}
