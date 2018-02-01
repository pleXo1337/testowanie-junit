package com.junit.classes;

public class Positive {
    final int zero = 0;

    public boolean isPositive(int n) {
        if (n > zero)
            return true;
        return false;
    }

    public int getZero() {
        return zero;
    }
}
