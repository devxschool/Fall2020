package class_structures;

public class ConsolePrinting {
    //println() -> will print and jump the cursor to the next line

    //java ignores white spaces. White spaces between statements are not part of the code.
    //
    public static void main(String[] args) {


        //print() -> prints the current line
        System.out.print("My Favorite Three Books: ");
        System.out.println("Malcolm Gladwell - Outliers");
        //println() -> prints to the current line and jumps to the next one
        System.out.print("10X Rule - Grant Cardone");


        //printing out special characters.
        // \ " '
        //we need to precede special characters with \
        // since you want to print out \\


        //in print out statements inside ("sdfgdfsgdgf")
        System.out.print("/     \\"); // => print out backslash;
        System.out.println("+ /");

        /*beginning of the comment

             is there a way to make tabs
            tabs -> three spaces.
            \t -> tab
            \n -> new line, enter
            \b -> deleting the character
            \

       end the comment  */
        System.out.println("Description of an item                   $20");
        System.out.println("Description of an item\t\t$20");
        System.out.println("Description of an item\b$20");

        System.out.println("Description of an item");
        System.out.println("$20");


        System.err.println("This is an error message created by me");
        System.err.print("Second Error message");
    }
}

//redundant -> extra. not needed.

