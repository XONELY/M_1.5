package org.example.BEHAVIOR.MEMENTO;

public class Runner {
    public static void main(String[] args) {
        Editor textEditor = new Editor();
        ECareTaker caretaker = new ECareTaker();

        textEditor.write("Hello World");
        caretaker.save(textEditor.save());
        textEditor.write("new Hello World");

        System.out.println(textEditor.getContent());
        textEditor.restore(caretaker.restore());
        System.out.println(textEditor.getContent());
    }
}
