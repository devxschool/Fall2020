//Every single Java file should start with package keyword and package name.
//So package keyword's purpose is simple: To declare under which package this class is created in.
// this line will be used for comments.
//in comment lines developer can write anything(we can write java keywords as well) so java keywords
//will be ignored.
//ex: class, package.

//for teaching purposes intructors will use comments to put notes about subjects.

//in real project devs(developers) use for leaving some notes for other devs.
//it's highly encouraged to use comments for notes.
package class_structures;

//public -> access modifier
//access modifier -> is a keyword which defines in which classes this class or method can be used.
//access modifier types ->
  //1. public  -->
  //2. default(we dont type anything) -->
  //3. protected
  //4. private

//for classes we can only use two access modifiers -> public and default.
//what is the access level of this class? default

//if your class is public, your class name must match with the fileName. Otherwise program will not work.
//order must be as follows:
//access modifier class ClassName {
public class SecondClass {

    //what is main method?
    //Every program must have at least one main method.
    //main method is a starting point of an application.
    //methods are functionalities.
    //when we start the program java behind the scenes(under the hood)
    //looks for a method with name main.
    public static void main(String[] args) {

        //print out to console
        //semi colons are used to end a statement.
        //statement as a sentence and semi as a period.
        System.out.println("I am super excited about becoming a pro programmer");
        System.out.println("My fav quote: \" Stay hungry, Stay Foolish\"");
    }
}


//file format -> every program uses certain type of file formats.
//ex: word document -> .docx
//ex: pictures -> .jpeg, .png
//ex: presentations -> .pdf, .ppt
//ex: plain text -> .txt
//ex: video -> .mp4, .vod, .avi
//ex: audio -> .mp3
//ex: excel -> .xlsx
//ex: compressed file -> .zip, .tar, .rar
//ex: executable file -> .exe



//{ -> Open curly brace
//} -> Close curly brace
//Curly braces always come in pairs -> they define the scope of a class, method, statement.

//Dynamic -> it can change.
//static -> it cannot change.


//IDE -> Integrated Development Environment
//Output -> result of the program
//output goes to console.




