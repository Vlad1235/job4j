package ru.job4j.inherit;

public class Doctor extends Profession {

    private int experienceInField;

    public Doctor(String name, String surname, long education, long birthday, int experienceInField) {
        super(name, surname, education, birthday);
        this.experienceInField = experienceInField;
    }
    public int getExperienceInField() {
        return this.experienceInField;
    }

    public void output(){
        super.output();
        System.out.println(getExperienceInField());
    }

}
