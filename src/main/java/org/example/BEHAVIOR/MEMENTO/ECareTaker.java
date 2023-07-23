package org.example.BEHAVIOR.MEMENTO;

public class ECareTaker {
    private EditorMemento memento;

    public void save(EditorMemento memento) {
        this.memento = memento;
    }

    public EditorMemento restore() {
        return memento;
    }
}
