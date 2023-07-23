package org.example.STRUCTURAL.ADAPTER;

public class Runner     {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Adapter adapter = new Adapter(monitor);
        adapter.connectVGA();
    }
}
