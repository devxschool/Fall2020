package oop.interfaces.human;

//do not use extends keyword
//implements
public class Man extends AbstractPerson {


    public Man(int foodConsumed, double weight) {
        super(foodConsumed,weight);
    }

    @Override
    public void eat() {
        System.out.println("Ate 1 kilo");
//        foodConsumed++;
//        weight++;
    }

    @Override
    public void rest() {

    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public double laugh() {
        return 0;
    }



    @Override
    public boolean isHealthy() {
        return false;
    }

    @Override
    public int getYearsInService() {
        return 0;
    }
}
