package ru.job4j.inherit;

public class Profession {
    private String name;
    private String surname;
    private long education;
    private long birthday;

    public Profession(String name, String surname, long education, long birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public long getEducation() {
        return this.education;
    }

    public long getBirthday() {
        return this.birthday;
    }

    public void output() {
        System.out.println(getName() + getSurname() + getEducation() + getBirthday());
    }


}
