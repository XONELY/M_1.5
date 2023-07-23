package org.example.CREATIONAL.PROTOTYPE;

public class Runner{
    public static void main(String[] args) {

        Person person = new Person(1,"John",12);
        System.out.println(person);

        PersonFactory personFactory = new PersonFactory(person);
        person = personFactory.copy();
        System.out.println(person);

    }
}
