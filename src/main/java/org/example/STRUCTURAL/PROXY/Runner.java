package org.example.STRUCTURAL.PROXY;

public class Runner {
    public static void main(String[] args) {
        Image image = new ProxyImage("cat.jpg");
        image.display();
        image.display();
    }
}