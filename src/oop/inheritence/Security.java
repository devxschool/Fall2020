package oop.inheritence;

import java.util.ArrayList;
import java.util.List;

public class Security extends Employee {

    List<String> combatSkills = new ArrayList<>();


    public Security(String name, String dob, String title, double salary) {
        super(name, dob, title, salary);
    }


    public List<String> getCombatSkills() {
        return combatSkills;
    }

    public void setCombatSkills(List<String> combatSkills) {
        this.combatSkills = combatSkills;
    }

    //this is overloading, bc login() is inherited from Employee class
//    public void login(String name) {
//        System.out.println("Welcome, Thanks for keeping us safe " + getName());
//    }

    @Override//helps to make sure you are actually overriding
    public void login() {
        System.out.println("Welcome, Thanks for keeping us safe " + getName());
    }


}
