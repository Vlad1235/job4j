package ru.job4j;

public class Programmer extends Engineer {
    Engineer intern1 = new Engineer(1,3);
    Engineer intern2 = new Engineer(1,5);

    Profession intern3 = new Profession("petr","petrov","high",122345);

    @Override
    public long getBirthday() {
        return super.getBirthday();
    }System.out.println()
}
