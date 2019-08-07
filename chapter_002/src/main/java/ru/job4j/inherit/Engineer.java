package ru.job4j.inherit;

public class Engineer extends Profession {

    private int quantityOfProjects;

    public Engineer(String name, String surname, long education, long birthday, int quantityOfProjects) {
        super(name, surname, education, birthday);
        this.quantityOfProjects = quantityOfProjects;
    }

    public int getQuantityOfProjects() {
        return this.quantityOfProjects;
    }

    public void output() {
        super.output();
        System.out.println(getQuantityOfProjects());
    }

}
