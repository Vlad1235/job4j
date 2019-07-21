package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * Это переменная экземпляра. Она доступна только конкретному объекту.
     */
    private int x;
    /**
     * Это переменная экземпляра. Она доступна только конкретному объекту.
     */
    private int y;
    /**
     * Это переменная экземпляра. Она доступна только конкретному объекту.
     */
    private int z;
    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param x
     * @param y
     * @param z
     */
    public Point(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Конструктор по умолчанию.
     */
    public Point(){
    }
    /**
     * Метод расчета расстояния для двумерного пространства.
     * @param that
     * @return
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    /**
     * Метод расчета расстояния для трехмерного пространства.
     * @param that
     * @return
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
    public void info() { // Метод выводит значение переменных экземпляра Х и У
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
    public void info3d() { // Метод выводит значение переменных экземпляра Х  У Z
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }
}
