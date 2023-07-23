package org.example.BEHAVIOR.OBSERVER;

public class Runner {
    public static void main(String[] args) {
        Insta insta = new Insta();
        insta.addPost("hello world");
        insta.addPost("second post");

        Observer follower = new Subscriber("Biba");
        Observer follower2 = new Subscriber("Boba");

        insta.addObserver(follower);
        insta.addObserver(follower2);

        insta.addPost("hello again");

    }
}
