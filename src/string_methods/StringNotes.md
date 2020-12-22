###Strings

####How to call String Methods?
-we use any String, be it a variable, literal
and follow it by a "."; 

ex: String str = "Hello";
str. -> from here you can access all of 
String methods that are available. 


###public String concat(String str)
concat method takes a String and adds it
to the orignal String and return the result.

ex: String str = "Hello";//original String
String result = str.concat(" World");



###public int length();
number characters in the String.
ex: String str = "Hello";
    int numOfCharacters = str.length(); => 5;
    
.length() get the quantity of characters, has nothing to do with
positions.
note: dont start from 0;
all special character as space, "," are considered as one 
single character as well. So we do count them as well.

###public char charAt(int index);
charAt method takes an int value and uses the value
to return one character. 

How is int index used? charAt method uses int index as a position of 
a character in a String to be returned. 

ex: String str = "Hello";
   //which number(integer) you need to provide will 
   //depend on the reqs(task);
   
 the index must be inside the range of 0-4 or 0 and str.length-1;
    char secondLetter = str.charAt(1);
   

What happens if the value is negative in charAt(-10);
if the index is out of range(both negative or more than length - 1) then
java will throw an Exception() runtime error.
StringIndexOutOfBoundsException. 


###public boolean isEmpty()
it returns true if the String is empty;
false otherwise;

ex: 
String str = "";
boolean result = str.isEmpty();//true

String str = "Hello";
str.isEmpty(); //false




    
    