package com.diyakektik.arayuz;

/**
 * Created by Hafta_Sonu on 27.11.2016.
 */

public class Circle implements ShapeOperationListener {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}



