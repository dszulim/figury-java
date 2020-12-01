package com.figures;

public class Circle extends Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * this.r * this.r;
    }

    @Override
    double circuit() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
