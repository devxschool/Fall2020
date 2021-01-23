###MAPS
Maps are key and value collections. Each key points to one value.
There 3 different implementations. 
HashMap, LinkedHashMap, TreeMap.

HashMap -> is unordered, and it allows one null in the key
and many nulls in the value; 

Maps are best to use when you want store large information. 
and have an easy way to access those info. 
In ex: All employee info can be accessed just by their employeeId. 

        //unlike List and Sets we have to provide
        //two data types in the <>.
        //first one for the data type of keys
        //second one for the data type of the values
        //Keys and values can only be Objects. 
        //so consider using WrapperClasses.


####public T(same data type as value) put(T key, T value) 
T is a generic data type that is defined at the Map initialization;

1. if the key doesnt exist in the map the new key value pair will be 
added; 
2. If the key already exists in the map the key value will be updated.
so the key is going to point to a new value.

It returns the new value it added/updated

###public T(same data type as value) get(T key);
get method return the value that the key we are passing maps to. 
if the key doesnt exist then get method returns null;


###public boolean containsKey(Object key)
will return true if the exact match of key exists in the map keys
false otherwise;


###public boolean containsValue(Object value)
will return true if the exact match of value exists in the map values
false otherwise;


####public T(same data type as value) replace(T key, T value) 
T is a generic data type that is defined at the Map initialization;

1. If the key already exists in the map the key value will be updated.
so the key is going to point to a new value.

2. If the key doesnt exist in the map nothing is going to happen.

It returns the old value.



####public Set<SameAsKey> keySet()
return a Set of all of the keys. We are creating a new separate
Set collection of just the keys. Why Set and why not List?
Bc keys are unique.

####public Collection<SameAsValue> values();
return a Collection of all of the values. 

Collection is like a List; it stores duplicate values
but one biggest difference is that it doesnt have .get(int index)
so we can not access values based on index.



####Map.Entry<KeyDataType,ValueDataType>
Map.Entry is an interface(data type) that represents one entry(key value pair)
in a Map. So far we know how to get Set of Keys and how to get Collection of
values. Now, question is: how do we get both keys and values?

ex:

    Map<Integer, String> map = new HashMap<>();
    map.put(12,"John Doe") -> this is one Map.Entry.
    map.put(13,"John Doe") -> Entry
    map.put(13,"John Doe")    
        