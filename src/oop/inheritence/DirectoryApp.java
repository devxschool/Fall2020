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




    }
}
