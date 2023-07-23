package org.example.BEHAVIOR.OBSERVER;

import java.util.*;

public class Insta implements Observed {
    List<String> posts = new ArrayList<>();
    List<Observer> followers = new ArrayList<>();

    public void addPost(String post) {
        posts.add(post);
        notifyObservers();
    }

    public void removePost(String post) {
        posts.remove(post);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        followers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : followers) {
            observer.handleEvent(posts);
        }
    }
}
