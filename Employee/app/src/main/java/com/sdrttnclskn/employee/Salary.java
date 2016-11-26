package com.sdrttnclskn.employee;


import android.util.Log;

public class Salary extends Employee {
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Salary(String name, String address, String number,int salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public double computePay(){

        Log.i("","Computing salary pay for"+ getName());
        return salary /52;

    }
    public void mailCheck(){

        Log.i("","Whithin mailCheck of salary class");
        Log.i("","mailing check to"+getName() +"salart" +salary);

    }
}
