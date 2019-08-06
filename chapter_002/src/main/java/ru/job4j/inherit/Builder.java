package ru.job4j.inherit;

public class Builder extends Engineer {

        public Builder(String name, String surname, long education, long birthday, int experienceInField){
            super(name,surname,education,birthday,experienceInField);
        }

    public void output(){ super.output(); }

}
