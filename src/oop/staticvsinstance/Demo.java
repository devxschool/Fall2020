package oop.staticvsinstance;

public class Demo {
    public static void main(String[] args) {

        Car c = new Car(12233243l,"ABC123", "BMW", "M5");
        Car c2 = new Car(2222222l,"ABC124", "BMW", "M3");

        System.out.println(Car.count);
        Car c3 = new Car(2222222l,"ABC124", "BMW", "M3");
        System.out.println(Car.count);
        c3.count = 0;

        System.out.println(Car.count);

    }
}
