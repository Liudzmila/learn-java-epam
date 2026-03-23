package main.java.com.epam.learn.designpatterns.behavioral.interpreter;

public class FirstLetterShouldBeCapital implements Expression {

    @Override
    public String interpret(String context) {
        context = context.substring(0, 1).toUpperCase() +
                context.substring(1);
        return context;
    }
}
