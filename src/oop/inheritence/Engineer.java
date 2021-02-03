package oop.inheritence;

import java.util.ArrayList;
import java.util.List;

//Inheritence helps us inherit variables and methods from Parent classes.
//Employee is a superclass, (parent class)
//Engineer is a subclass   (child-class)

//General
public class Engineer extends Employee {
    List<String> tools = new ArrayList<>();

    //onTarget or not on Target
    private boolean isOnTarget;

    public Engineer(String name, String dob, String title, double salary) {
        //calling a constructor from the direct super class
        super(name, dob, title, salary);
    }

    public List<String> getTools() {
        return tools;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public void promote() {
        super.salary += 10000;
    }

    @Override
    public Double grantBonus() {
        return salary * 0.2;
    }

    public Double bonus() {
        if (isOnTarget) {
            return grantBonus();
        }else {
            return (Double)super.grantBonus();
        }
    }

    public void setOnTarget(boolean isOnTarget) {
        this.isOnTarget = isOnTarget;
    }
}
