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

###public String substring(int i)
access modifier - protected, private, default.
public we can use in any class

return type -> String. Result of the method.

name of the method is substring. 
param -> information which we have to provide(give) to the method.

This method is public method that takes an int does something with that int and returns a new String.

it return a substring starting from the given index(i). 
ex: String str = "Hello";
    str.substring(2); => llo;
    
   takes the starting and goes till the end of the String.
   

###public String substring(int i, int j);
it takes two integers uses them return a String.

i -> starting point inclusive. 
j -> ending point, exclusive.

String str = "DevX School";

str.substring(0,4) => DevX;
str.substring(5) => School;

###public int indexOf(String s)
takes a string and return an int.

s -> represents a substring of which you want to find the index of. it could also be 
just one character. 

indexOf return the index of a first occurrence of the given substring.
if the substring doesnt exist in this String then return -1;

ex: "DevXSchool".indexOf("S") => 4;

ex: "Hello World".indexOf("or");

ex: "Java SDET".indexOf("ava"); => 1

ex: "Senior SDET".indexOf("Seniorita"); => -1;

ex: "Brooklyn".indexOf("o"); => 2;


###public int indexOf(String s, int i)

s -> substring
i -> index

return the index of a first occurrence of a substring(s), however start looking for substring
from a given index(i). 

i -> specifies what needs to be skipped. Skip everything until then index, and compare from there


ex: String str = "Mega Mega Megafon";
str.indexOf("e", 3); => 6;

str.indexOf("ga", 4); => 7;








   
    








    
    