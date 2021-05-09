package co.com.javacourse.university.model;

import co.com.javacourse.university.utils.Constans;

public abstract class Person {
    private String name;
    private int id;

    public Person(String name) {
        this.name = name;
        this.id = Constans.PERSON_ID;
        Constans.PERSON_ID ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
