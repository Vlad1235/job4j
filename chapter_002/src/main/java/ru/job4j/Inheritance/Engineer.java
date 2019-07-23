package ru.job4j.Inheritance;

public class Engineer extends Profession {
    private int yearsAtUniversity;
    private int quantityOfProjects;

    public Engineer(int years, int quantity){
        this.yearsAtUniversity = years;
        this.quantityOfProjects = quantity;
    }

    public int getYearsAtUniversity(){
        return this.yearsAtUniversity;
    }
    public int getQuantityOfProjects(){
        return this.quantityOfProjects;
    }

}