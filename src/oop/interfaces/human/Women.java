package oop.interfaces.human;

public class Women extends AbstractPerson {

    public Women(double foodConsumed, double weight) {
      super(foodConsumed,weight);
    }

    @Override
    public void eat() {

        System.out.println("ate 200gm");
//        foodConsumed+=0.2;
//        weight+=0.2;

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
