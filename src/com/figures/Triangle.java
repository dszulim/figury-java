package com.figures;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        return Math.pow(this.a, 2) * Math.sqrt(3) / 4;
    }

    @Override
    double circuit() {
        return this.a + this.b + this.c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
