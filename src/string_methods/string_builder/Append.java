package string_methods.string_builder;

public class Append {

    public static void main(String[] args) {
        //String builder
        StringBuilder fullName = new StringBuilder("elon");

        fullName
                .append(" ")
                .append("musk")
                .append(" ")
                .append(11)
                .append("/")
                .append(11)
                .append("/")
                .append(1968);

        System.out.println(fullName);
        //try with replace
        fullName.deleteCharAt(0).insert(0,"E");
        System.out.println(fullName);


        fullName.deleteCharAt(fullName.indexOf("musk")).insert(fullName.indexOf("usk"),"M");
        System.out.println(fullName);

        fullName.length();


        StringBuilder sb  = new StringBuilder("Hello World");
        sb.reverse();

        System.out.println(sb);

        //Given a US Phone number without "-"
        //ex: 3127302097
        //make it in the following format -> +1 312-730-2097



        //delete all suffixes from company names.
        //DevXSchool LLC
        //CME Group Inc
        //Apple Inc
    }
}
