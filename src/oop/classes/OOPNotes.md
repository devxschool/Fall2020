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
