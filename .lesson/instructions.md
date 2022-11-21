# Instructions  
### Description:
A HashMap is a commonly used implementation of the Map interface which is part of the Collections Framework, but does not inherit from the Collection interface. A map is a data structure that stores key-value pairs where each key is unique. A key-value pair is made up of two elements that are associated with one another. The key is what the map uses to uniquely identify and locate its related value. Together, these key-value pairs make up an **entry** in a Map. Additionally, data within a HashMap is not guaranteed to be placed or retrieved in any particular order. Sets are commonly used as part of other systems, or when the idenfication of a unique value is important.

Common HashMap methods:
- **put**: Adds a key-value pair to the Map. If the key is already in the Map, it will be associated with the new value.
- **remove**: Removes a key-value pair from the Map
- **get**: Returns the value associated with a key
- **values**: Returns a collection of values that are contained within the Map
- **keySet**: Returns a set of all the keys in the Map
- **entrySet**: Returns all of the entries in the Map

In this activity we will explore how to create and use HashMaps in Java. Please follow the steps below:

### Steps:
1. Add the following code to the *main()* method:
```Java
Map<Integer, String> topMovies = new HashMap<>();

topMovies.put(1, "The Shawshank Redemption");
topMovies.put(2, "The Godfather");
topMovies.put(3, "The Dark Knight");
topMovies.put(4, "The Godfather: Part II");
topMovies.put(5, "12 Angry Men");

 System.out.println(topMovies.get(3));
```
We created a Map named *topMovies* and added 5 entries. Note that the Map works with keys of the `Integer` type and values of the `String` type. We also retrieved the value associated with the key `3` and printed it out to the console. Run the program to see the output.

2. Next, add the following code to the *main()* method below what you have so far:
```Java
System.out.println(topMovies.keySet());
    
System.out.println(topMovies.values());

System.out.println(topMovies.entrySet());
```
Run the program and look at the output. The first line of output prints just the keys, the second line prints just the values, and the third line prints the key-value pairs.

3. Now it's your turn. Create a HashMap that takes in `String` keys and `Integer` values, then name it *employees*. This map will contain entries full of employee names and employee IDs.
  
4. Add the following employees to the map:
- `Deer Park`, `345`
- `Homer Simpson`, `234`
- `Gordon Freeman`, `445`
- `Nikola Tesla`, `543`
  
5. Use the *get()* method on your new Map using a the key `Gordon Freeman` and print the value to the console.
   
6. Print out the *keySet()*, *values()*, and *entrySet()* of your map. 

#### Sample output:
```
The Dark Knight
[1, 2, 3, 4, 5]
[The Shawshank Redemption, The Godfather, The Dark Knight, The Godfather: Part II, 12 Angry Men]
[1=The Shawshank Redemption, 2=The Godfather, 3=The Dark Knight, 4=The Godfather: Part II, 5=12 Angry Men]
445
[Gordon Freeman, Deer Park, Nikola Tesla, Homer Simpson]
[445, 345, 543, 234]
[Gordon Freeman=445, Deer Park=345, Nikola Tesla=543, Homer Simpson=234]
```