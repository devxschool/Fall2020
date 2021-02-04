package oop.inheritence;

import java.util.ArrayList;
import java.util.List;

//Build a project which will be a directory of Employees;
//Apple
public class Employee {

    private String name;
    private String dob;
    private String title;
    public double salary;
//    private Department department;


    public Employee(String name, String dob, String title, double salary) {
        this.name = name;
        this.dob = dob;
        this.title = title;
        this.salary = salary;
    }

    /**
     *
     */
    protected void login() {
        System.out.println("Welcome " + name);
    }

    public Number grantBonus() {
        return salary * 0.05;
    }

    //print out title
    private void printTitle(){
        System.out.println(title);
    }

    public void promote(){
        salary+=5000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static double getW2(double salary) {
        return salary * 0.20;
    }
}
