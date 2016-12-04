package com.diyakektik.arayuz;

/**
 * Created by Hafta_Sonu on 27.11.2016.
 */

public class Rectangele implements ShapeOperationListener {

    double witdh;
    double height;

    public Rectangele(double witdh, double height) {
        this.witdh = witdh;
        this.height = height;
    }

    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh) {
        this.witdh = witdh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return witdh*height;
    }
}
