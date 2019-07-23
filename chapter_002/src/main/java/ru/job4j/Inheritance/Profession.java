package ru.job4j.Inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private long birthday;

    public Profession(){ }

    public Profession(String name, String surname, String education, long birthday){
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getEducation(){
        return this.education;
    }
    public long getBirthday(){
        return this.birthday;
    }
}
