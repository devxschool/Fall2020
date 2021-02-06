package oop.inheritence.abstractclass;

import java.util.List;

//Scalability of the project,framework; => ability to grow.
//a class can only extend one class.
public abstract class Shop {

    public abstract List<String> getAllProducts();

    /**
     * to return which vehicle came last.
     * @return
     */
    public abstract Vehicle getTheLastVehicleInTheShop();

}
