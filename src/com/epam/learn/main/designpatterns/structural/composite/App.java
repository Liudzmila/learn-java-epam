package com.epam.learn.main.designpatterns.structural.composite;

public class App {

    public static void main(String[] args) {
        var a = new Note('A');
        var b = new Note('B');
        var c = new Note('C');
        var d = new Note('D');
        var e = new Note('E');
        var f = new Note('F');
        var g = new Note('G');

        var doReMi = new Song();
        doReMi.addNote(c);
        doReMi.addNote(d);
        doReMi.addNote(e);
        doReMi.addNote(c);
        doReMi.addNote(e);
        doReMi.addNote(c);
        doReMi.addNote(e);

//        doReMi.getNotes().get(0).play();
//        doReMi.getNotes().get(1).play();
//        doReMi.getNotes().get(2).play();
//        doReMi.getNotes().get(3).play();
//        doReMi.getNotes().get(4).play();
//        doReMi.getNotes().get(5).play();
//        doReMi.getNotes().get(6).play();

        doReMi.play();
    }
}
