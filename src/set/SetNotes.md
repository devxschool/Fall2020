###SET
Set is a collection that implements collection 
interface. It can store elements of same data type.
But Elements can not be duplicate. So it's a
collection of unique values. 
Values in a Set are unordered. 

So you should consider using a SET if you 
want to avoid duplicate values and you dont 
actually care about the order of values.
ex:

    phone numbers -> cell phone numbers on a phone. 
    ssn of all citizens in Gov applications. 
    ssn for credit company.
    EmployeeId, StudentId. 
    Number in a line in DMV.
    
   
####Methods
Dont Have get method like Lists. BC get method requires indexes.
#####public boolean add(E value)
add method will add the value and return true if the value
doesnt already exist in the Set.

add method will return false and not add anything if the
Set already contains the value.

#####public boolean addAll(Collection collection)
it's going to add the collection to the Set


###Iterators

boolean hasNext(): It returns true if Iterator has more element to iterate. similar to isEmpty();
Object next(): It returns the next element in the collection until the hasNext()method return true. This method throws ‘NoSuchElementException’ if there is no next element.
void remove(): It removes the current element in the collection. This method throws ‘IllegalStateException’ if this function is called before next( ) is invoked.

####LinkedHashSet
Collection of Unique Ordered Objects. Insertion order


####TreeSet
Collection of Unique Ordered Objects. Alphabetical, or numeric order. asc by default,  can be changed.





