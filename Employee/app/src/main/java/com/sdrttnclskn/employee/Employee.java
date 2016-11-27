package com.sdrttnclskn.employee;

import android.util.Log;

public class Employee {
    String name;
    String address;
    String number;

    public Employee(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public  void mailCheck(){

        Log.i("Employee", this.name + "  " + this.address);

    }
}
