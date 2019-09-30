package ru.job4j.pseudo;

public class Triangle implements Shape {

    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("   x  ");
        sb.append(System.lineSeparator());
        sb.append("  x x ");
        sb.append(System.lineSeparator());
        sb.append(" x   x");
        sb.append(System.lineSeparator());
        sb.append("xxxxxxx");
        return sb.toString();
    }
}
