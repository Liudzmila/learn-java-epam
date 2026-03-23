package main.java.com.epam.learn.designpatterns.behavioral.interpreter;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        var lastShouldBePeriod = new LastShouldBePeriod();
        var result = lastShouldBePeriod.interpret(context);
        System.out.println(result);
    }
}
