##Lists

- Lists have dynamic size. Size can be dynamically changed at the runtime. (while program is running)
- Lists have many handful methods
- Lists can only store non-primitive data types (Objects), so we can not store primitives like int,double, char
rather we have to use Wrapperclass for each primitive data type.


##Wrapper classes
each primitive data type has a wrapper class which is essentially a workaround for lists to be able to store
data types such as Intgers, double.

int -> Integer
double -> Double
char -> Character
boolean -> Boolean
float -> Float


We can still perform all arithmetical operation using Wrapper classes.


All Wrapper classes have static method like parseInt, parseDouble that help us to
convert Strings to Wrapper clases.


####autoboxing vs unboxing Wrapper Classes
There is  an automated process of converting primitive and wrapper class data types 
between each other. 

autoboxing => when you assign a literal values to
corresponding Wrapper classes
this process is called autoboxing.
ex:

     Integer num = 1;
     int num2 = 10;
     Integer num3 = num2;
     
     
unboxing => when you assing a Wrapper class value to a primitive data type.
ex:

     Integer num1 = new Integer(12);
     int  num2 = num1;
     
     
     
###Convert Lists to Arrays
There are some problems which would require you to convert Lists to Arrays
it possible in Java List has a method called toArray();


####Object
Object is a data type(class) which is the Adam(Eve) of all classes. Every single class
in java extend(Inheritance) from Object class. 



###Collections class
is a helper class for Lists like Arrays class for arrays.


     
 