package methods;

public class DemoInstanceAndStaticMethods {

    //for the first time we are trying to use methods outside of one class
    public static void main(String[] args) {
        System.out.println(Math.abs(-20));
        System.out.println(StaticMethods123.absolute(-20));

        InstanceMethods instanceMethods = new InstanceMethods();
        System.out.println(instanceMethods.getGasPrice());
    }


}
