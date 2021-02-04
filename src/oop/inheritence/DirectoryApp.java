package oop.inheritence;

public class DirectoryApp {

    public static void main(String[] args) {
        Employee elon = new Employee("Elon", "06/01/1968", "CEO", 1000000.00);

        Engineer johnDoe =
                new Engineer("John Doe", "01/23/1970", "Software Engineer", 100000.00);

        Security jetLee = new Security("Jet Lee", "02/11/1950", "Security", 122343434.00);

        System.out.println(elon.getDob());
        System.out.println(johnDoe.getDob());
        elon.promote();
        johnDoe.promote();
        System.out.println(elon.getSalary());
        System.out.println(johnDoe.getSalary());

        elon.login();
        johnDoe.login();
        jetLee.login();
        System.out.println(elon.grantBonus());
        System.out.println(johnDoe.grantBonus());

        ////a variable has a data type
        //and a value

        int num = 0;
        double d = 0.0;
        double d1 = 0;
        double d2 = num;


        //in java we can assign subclasses to superclasses;

        Number number = new Double(12.44);


        //polymorphism => ability to take different forms;
        Employee employee =
                new Engineer("John Doe", "01/23/1970", "Software Engineer", 100000.00);

        Employee employee1 =
                new Security("Jet Lee", "02/11/1950", "Security", 122343434.00);

//        Engineer e = new Security("Jet Lee", "02/11/1950", "Security", 122343434.00);

        //only methods from the data of a variable will be available to execute
        System.out.println(employee.salary);





    }
}
