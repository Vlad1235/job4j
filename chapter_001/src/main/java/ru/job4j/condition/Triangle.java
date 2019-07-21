package ru.job4j.condition;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    /**
     * Конструктор. Входные данные для класса Triangle.
     * @param ap
     * @param bp
     * @param cp
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**
     * Метод вычисления полупериметра по длинам сторон.
     * Формула.
     * (a + b + c) / 2
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полуперимента.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.*
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.*
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return условие.
     */
    private boolean exist(double a, double c, double b) {
            return a + b > c && a + c > b && c + b > a;
        }
    /**
     * Метод должен вычислить площадь треугольника.*
     * Формула.
     * √ p *(p - a) * (p - b) * (p - c)
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}
