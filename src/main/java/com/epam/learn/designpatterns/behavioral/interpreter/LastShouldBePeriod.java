package main.java.com.epam.learn.designpatterns.behavioral.interpreter;

public class LastShouldBePeriod implements Expression {

    private final FirstLetterShouldBeCapital firstLetterShouldBeCapital = new FirstLetterShouldBeCapital();

    @Override
    public String interpret(String context) {
        if (!context.endsWith(".")) {
            context = context + ".";
        }
        return firstLetterShouldBeCapital.interpret(context);
    }
}
