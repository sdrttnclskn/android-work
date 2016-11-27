package com.diyakektik.arayuz;

/**
 * Created by Hafta_Sonu on 27.11.2016.
 */

public class Triangle implements ShapeOperationListener {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }
}
