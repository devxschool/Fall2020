###OOP
OOPs primary usage is to create custom(own) data types which can 
represent the entities our company manages. 
in ex: 

a class for a Trader -> information about the trader
a class for an account  -> information about an account.

####Classes
Classes are blueprints for the information. By designing classes
we are dictating, choosing what kind of information needs to be 
provided and further stored about an entity.

ex: class for a Trader. 
As a PO I want to validate Trader's age, ssn, porfolio.

As a Bank Account user, I want to have info about my current balance.
about my last 10 transactions.
about my account and routing numbers.

###Constructors
 what are constructors?
 is a special method that we use to initialize the instance variables
 Constructors are used to force the class users to provide the required information
 before they are able to use this data type(before they are able to initialize an object
    from this class.

    constructors can be overloaded as well.
    Constructor is a special method that matches the name of the class and
     has no return type.
    no arg constructor
    public Room(){

    }

###Default Constructors
if no constructor is created in a class java provides default no argument constructor.
if any kind of constuctor is created the default constructor is not avaialable any more.



###Behaviors of Objects(Instance Methods)
Methods(functions) that use the information from the state of an object and performs so logic.

or methods that take any external information and use it to change the state of an object.

Instance Methods are the methods tha exclusively belong to a particular object.
So you can use them only after creating an Object and from a reference to that object.


###What is encapsulation? 
Encapsulation is a process of hidding instance variable(by making them private) from being accessed outside of classes in order to avoid
undesired values being assigned to the intance variable. Instead Getter and Setter methods
are used to get the value and update the value of an instance variable respectively.

With Encapsulation we can add certain conditions in setter method which will restrict undesired 
values to be assigned.



###POJO and BEANs
Plain Old Java Object and Beans are classes that have instance variables and getters and setters only




###Static Members
Static Members are variables and methods that do not belong to an object.
Static variables considered to be global variables, which means static variables are 
global to all objects that have been or will be created from a class. 

there is only one value of a static variable for all objects created from the class.

###Static methods
Static methods can we used without creating an object. 
Helper methods(Utility methods) are usually static methods.

Wrapper classes have many utility methods. 
Collection class,
Math.max(), Math.min()

Utility methods are the functions which dont require object state info to be executed. 



###STATIC VS INSTANCE
static is the same for all objects, instance is unique to each object. static is a global variable that doesnt belong
to a specific object, rather it belongs to a class it is an info that can be shared by all objects from the class;


####Inheritance
Inheritance is a process of avoiding code repeatition, which is a very bad practice in programming. 
So imagine you have a class which has bunch of methods and you need to create another class which will need the same 
information + some more methods. So we can create a class and extend the existing class which will inherit
all exisiting methods from the super class. You dont 
have to recreate all the methods here, java will
automatically inherit the methods to a new class;

Inheritance is a process of inherting all public and protected
variables and instance from a Parent class by using 
extends keyword. It's good when you need to create objects
that have extra info(functionalities) on top of what the existing class has.


###Final 
variable, methods and classes can be declared final;
when variables are final -> their values can not be changed once initialized.
when methods are final ->  final method can not be overridden. Note:
We are able inherit final methods but not override it.



###Method overloading vs overriding
Overloading a method is a process of keeping the same method name 
with different parameters. so access modifiers, returns type can be different.
name must be the same, and params must be different. So the advantage is
to avoid coming up with many names for similar functions. 


Overriding is a process used in Inheritance. When a subclass inherits 
methods from a Super class and the subclass needs to have a custom(specific)
implementation of any of the methods, inherited method needs to be overridden;

The method in the child class must have the same signature as the method in the parent 
final and static methods can not be overridden;
The method in the child class must be at least as accessible or more accessible 
than the method in the parent class. 





