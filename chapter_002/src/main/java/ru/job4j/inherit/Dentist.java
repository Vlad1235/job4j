package ru.job4j.inherit;

public class Dentist extends Doctor {

    public Dentist(String name, String surname, long education, long birthday, int experienceInField) {
        super(name, surname, education, birthday, experienceInField);
    }

    public void output() {
        super.output();
    }

}
