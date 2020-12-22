package methods;

public class Calculator {

    public static void main(String[] args) {
//        System.out.println(Calculator.calculateTax(true, 10000000));
        Calculator c = new Calculator();
        double d = c.calculateTax(true, 100000);
        System.out.println(d);
    }

    //when do you print inside vs return.
    //it totally depends on your task(reqs).

    //but usually if you have a task to print out something you will just use void
    //but if you have task to calculate something and give the result then you will need return.


    //task calculateTax
    //if married the tax should be salary * 5/100;
    //if not married the tax should be salary * 30/100;
    //
    //should I write a method??
    //what should be the return type -> should I just printout or return? return tax.
    //is salary int or double? double
    //what us return type?


    public double calculateTax(boolean isMarried, double salary) {
        double tax = 0;

        if (isMarried) {
            tax = salary*5/100;
        }
        else {
            tax = salary*30/100;
        }

        return tax;
    }

    /**
     * instance methods can be called inside instance methods "within the same class" without creating an object.
     * @param isMarried
     * @param salary
     */
    public void printTax(boolean isMarried, double salary) {
        System.out.println(calculateTax(isMarried, salary));
    }

    //understand what is return type?
    //memorize method definition syntax.
    //research more on params.


    //write a method which give me exam grade based on the exam score
    //90 and 100 - A
    //80 and 90  - B
    //70 and 80 - C
    //60 and 70 - D
    //anything below F

    //you need take exam score as int
    //return char

    //write a function which will  convert miles to killometers
    //get miles return kilometers


    //write a method which will take a Full Name and Job Title and create an email signature

    //John Doe, Sr. SDET

    //John Doe
    //Sr. SDET at Google
    //All information is confidential.
    //google.com, maps.google.com
    //312-730-2097

    //no return type.
}
