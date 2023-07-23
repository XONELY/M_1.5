package org.example.BEHAVIOR.OBSERVER;

import java.util.List;

public class Subscriber implements Observer {
    String name;
    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> posts) {
        System.out.println("Dear " + name + "We have received " + posts + " new posts    ");
    }
}
