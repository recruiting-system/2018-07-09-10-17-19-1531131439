package practice11;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        return o!=null && getId()== ((Person)o).getId();
    }


    public String introduce(){
        return "My name is " + name+ ". I am " + age+ " years old.";
    }
}






