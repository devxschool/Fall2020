package string_methods;

public class StartsWith {

    public static void main(String[] args) {
        String str = "E1234";
        //D1242
        //M23453
        //I234345

        if(str.startsWith("E")){
            //send an email dedicated to Engineers.
        }
        else if(str.startsWith("I")) {
            //send a motivation email for Christmas
        }
        else if(str.startsWith("M")) {
            //send them thanks for achieving milestones.
        }

        String str2 = "Hello World";
        System.out.println(str2.startsWith("l",2));
    }
}
