package oop.hospital;

public class HospitalApp {

    public static void main(String[] args) {

        Patient p1 = new Patient("01/20/1991", "John Doe", 'M', "777-777-7777");
        Patient p2 = new Patient("03/10/1970", "Alex Marino", 'M', "888-888-8888");
        Patient p3 = new Patient("02/22/1922", "Alexa Amazon", 'F', "212-212-2112");
        Patient p4 = new Patient("09/20/1994", "Siri Apple", 'F', "345-3333-5555", "Canadian");
        Patient p5 = new Patient("01/20/1991", "Tesla Musk", 'M', "777-777-7777", "African");

        //can please do something so I can see the whole information about the patient.
        Patient p6 = new Patient("01/20/1991", "Tesla Musk", 'M', "777-777-7777");
        Patient p7 = new Patient( "SpaceX Musk", 'M', "777-777-7777");


        p6.printAllInfo();
        p1.printAllInfo();
        p3.printAllInfo();
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
    }
}
