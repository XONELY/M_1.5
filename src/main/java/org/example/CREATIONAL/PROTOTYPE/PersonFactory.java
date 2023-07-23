package org.example.CREATIONAL.PROTOTYPE;

public class PersonFactory {
    Person person;
    public PersonFactory(Person person) {
        this.person = person;
    }

    public Person copy() {
        return (Person) person.copy();
    }
}
