package com.figures;

public class Rectangle extends Figure {
    private double a, b, c, d;

    public Rectangle(double a, double b) {
        this.a = a;
        this.c = a;
        this.b = b;
        this.d = b;
    }

    @Override
    double area() {
        return this.a * this.b;
    }

    @Override
    double circuit() {
        return this.a + this.b + this.c + this.d;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
