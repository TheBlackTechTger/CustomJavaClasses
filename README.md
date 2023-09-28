# Array Functions

This is a Java class called `arrayFns` that provides various utility functions for working with arrays of different data types, including `int`, `char`, `String`, `float`, `double`, `boolean`, `long`, `short`, and `byte`. These functions include operations such as appending elements to an array, converting arrays to strings, sorting arrays in ascending or descending order, finding occurrences of an element in an array, and more.

## Getting Started

To use these array functions, you can create an instance of the `arrayFns` class and call its methods as needed.

```java
arrayFns arrayFunctions = new arrayFns();
```

## Functions

### Append Functions

These functions allow you to append elements to arrays of different data types.

- `append(int[] preary, int obj)` - Append an integer to an integer array.
- `append(char[] preary, char obj)` - Append a character to a character array.
- `append(String[] preary, String obj)` - Append a string to a string array.
- `append(float[] preary, float obj)` - Append a float to a float array.
- `append(double[] preary, double obj)` - Append a double to a double array.
- `append(boolean[] preary, boolean obj)` - Append a boolean to a boolean array.
- `append(long[] preary, long obj)` - Append a long to a long array.
- `append(short[] preary, short obj)` - Append a short to a short array.
- `append(byte[] preary, byte obj)` - Append a byte to a byte array.

### Array to String Functions

These functions convert arrays to strings with customizable separators.

- `aryToStr(int[] ary, String ch)` - Convert an integer array to a string with a specified separator.
- `aryToStr(char[] ary, String ch)` - Convert a character array to a string with a specified separator.
- `aryToStr(String[] ary, String ch)` - Convert a string array to a string with a specified separator.
- `aryToStr(float[] ary, String ch)` - Convert a float array to a string with a specified separator.
- `aryToStr(double[] ary, String ch)` - Convert a double array to a string with a specified separator.
- `aryToStr(boolean[] ary, String ch)` - Convert a boolean array to a string with a specified separator.
- `aryToStr(long[] ary, String ch)` - Convert a long array to a string with a specified separator.
- `aryToStr(short[] ary, String ch)` - Convert a short array to a string with a specified separator.
- `aryToStr(byte[] ary, String ch)` - Convert a byte array to a string with a specified separator.

### Sorting Functions

These functions allow you to sort arrays in ascending or descending order.

- `sortAscending(int[] ary)` - Sort an integer array in ascending order.
- `sortAscending(char[] ary)` - Sort a character array in ascending order.
- `sortAscending(String[] ary)` - Sort a string array in ascending order (lexicographically).
- `sortAscending(float[] ary)` - Sort a float array in ascending order.
- `sortAscending(double[] ary)` - Sort a double array in ascending order.
- `sortAscending(boolean[] ary)` - Sort a boolean array, moving `true` values to the beginning.
- `sortAscending(long[] ary)` - Sort a long array in ascending order.
- `sortAscending(short[] ary)` - Sort a short array in ascending order.
- `sortAscending(byte[] ary)` - Sort a byte array in ascending order.

- `sortDescending(int[] ary)` - Sort an integer array in descending order.
- `sortDescending(char[] ary)` - Sort a character array in descending order.
- `sortDescending(String[] ary)` - Sort a string array in descending order (lexicographically).
- `sortDescending(float[] ary)` - Sort a float array in descending order.
- `sortDescending(double[] ary)` - Sort a double array in descending order.
- `sortDescending(boolean[] ary)` - Sort a boolean array, moving `true` values to the end.
- `sortDescending(long[] ary)` - Sort a long array in descending order.
- `sortDescending(short[] ary)` - Sort a short array in descending order.
- `sortDescending(byte[] ary)` - Sort a byte array in descending order.

### Other Functions

- `occurence(T[] ary, T n)` - Count the number of occurrences of an element `n` in an array of type `T`.
- `indexOf(T[] ary, T ob)` - Find the first index of an element `ob` in an array of type `T`.
- `lastIndexOf(T[] ary, T ob)` - Find the last index of an element `ob` in an array of type `T`.
- `concat(T[] ary1, T[] ary2)` - Concatenate two arrays of type `T`.
- `remDubli(T[] ary)` - Remove duplicates from an array of type `T`.

Please note that `T` represents a generic

 data type, and you should replace it with the appropriate data type based on the array you are working with (e.g., `int`, `char`, `String`, etc.).

## Example Usage

Here's an example of how you can use some of these array functions:

```java
arrayFns arrayFunctions = new arrayFns();

// Append elements to an array
int[] intArray = { 1, 2, 3 };
intArray = arrayFunctions.append(intArray, 4);

// Convert an array to a string
String[] stringArray = { "Hello", "World" };
String arrayAsString = arrayFunctions.aryToStr(stringArray, ",");

// Sort an array in ascending order
int[] unsortedIntArray = { 5, 3, 1, 4, 2 };
int[] sortedIntArray = arrayFunctions.sortAscending(unsortedIntArray);

// Find the index of an element in an array
int[] searchArray = { 10, 20, 30, 40, 50 };
int indexOfElement = arrayFunctions.indexOf(searchArray, 30);
```

Feel free to use these array functions to simplify working with arrays of different data types in your Java applications.
