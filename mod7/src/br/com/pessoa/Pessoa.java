package br.com.pessoa;

public class Pessoa {
    private String name;
    private String lastName;
    private int age;
    private boolean isMarried;

    public Pessoa(String name, String lastName, int age, boolean isMarried) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
