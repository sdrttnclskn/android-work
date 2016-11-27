package com.sdrttnclskn.shape;




public class Rectangle extends Shape {

    double lenght;
    double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }


    @Override
    double getArea() {

        // TODO a*b
        double area = width *lenght;
        return area;
    }
}
