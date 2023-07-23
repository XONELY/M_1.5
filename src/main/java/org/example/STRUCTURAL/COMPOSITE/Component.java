package org.example.STRUCTURAL.COMPOSITE;

public abstract class Component {
    protected String name;
    public Component(String name) {
        this.name = name;
    }
    public abstract void show();
}
