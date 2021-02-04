package oop.inheritence.abstractclass;

public class Demo {

    public static void main(String[] args) {
        //you can not create an object from an Abstract class; but you can use Abstract classes as data types;

//        Car car = new Car("s",123,"Sd","blue");
        Car s = new Gas("S",0,"MB","White",20);
        //Methods that are available for execution are defined by the dataType;
        //methods that will executed are defined by the Object;
        //this process is decided in the runtime
        s.print();
        s.drive();

        System.out.println(s.getMake());


        Car tesla = new Electric("S",12,"Tesla","White",1200);

        tesla.rollDownWindow();
        tesla.notify();
    }
}
