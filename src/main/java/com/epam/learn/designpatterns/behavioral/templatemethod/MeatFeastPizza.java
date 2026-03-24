package main.java.com.epam.learn.designpatterns.behavioral.templatemethod;

public class MeatFeastPizza extends Pizza {

    @Override
    public void addToppings() {
        System.out.println("Add pepperoni, ham and chicken" );
    }
}
