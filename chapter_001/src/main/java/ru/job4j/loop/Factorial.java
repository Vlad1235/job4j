package ru.job4j.loop;

public class Factorial {
    int result;

    public int calc(int n) {
        result = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        } else {
            result = 1;
        }
        return result;
    }
}

