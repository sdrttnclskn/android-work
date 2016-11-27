package com.sdrttnclskn.shape;



public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {

        // TODO pi *r*r

        double area = Math.PI *radius*radius;
        return area;


    }
}
