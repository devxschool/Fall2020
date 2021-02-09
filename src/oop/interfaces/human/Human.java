package oop.interfaces.human;

public interface Human extends Cycle {
    //we can only have public static final variables -> constants
    //in the interface

    void eat();

    void rest();

    int run();

    double laugh();

    /**
     * methods that work exactly the same for all implement of this
     * interface
     */
    default void sayHello() {
        System.out.println("Hello");
    }
}
