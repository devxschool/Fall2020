package methods;

public class InstanceMethods {
    public static void main(String[] args) {
        InstanceMethods i = new InstanceMethods();
        System.out.println(i.getGasPrice());
    }


    protected double getGasPrice(){
        return 1.96;
    }





    //non static methods are called instance methods
    //and they can only be called from a reference to an object

    //Which ever class the method is defined in
    //you will have to create an Object of that class

    //Creating an object:
    //class Apple{
    //  public double getWeight(){
    //          return 1.2;
    //      }
    // }

    //Apple a = new Apple();
    //a.getWeight();
    //
}
