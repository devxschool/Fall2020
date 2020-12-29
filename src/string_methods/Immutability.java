package string_methods;

public class Immutability {


    public static void main(String[] args) {
//        String s1 = "1";
//        String s2 = s1.concat("2");
//        s2.concat("3");//skip
//        System.out.println(s2);//12

//        String s1 = "1";
//        String s2 = s1.concat("2").concat("3");//method chaining
//        System.out.println(s2);//123 ->


//        String s1 = "1";
//        String s2 = s1.concat("2");
//        s2 = s2.concat("3");//s2+="3";
//        System.out.println(s2);//123


        String s1 = "1";
        String s2 = s1.concat("2");
        s2+="3";//s2+="3";
        System.out.println(s2);
    }
}
