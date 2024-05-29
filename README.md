# Arrays and Methods

## Arrays as parameters
When passing an array as a parameter to a method, you are passing a reference to the array, therefore, the parameter variable in the method points to the same array as the calling program.

In the image below, the `sumArray` method computes the sum of the given array.  Notice that when executing `sumArray`, the parameter variable `myArray` points to the same array as the `intArray` variable.

```java
public class Problem1 extends ConsoleProgram {
    public void run() {
      // Initialize variables
      int[] intArray = {5, 6, 7, 8};
      int sum = sumArray(intArray);
      
      // Output sum of intArray
      System.out.println(sum);
    }
    
    /**
     * Sums all the numbers in an array
     * @param myArray   array of integers
     * @return sum of ints in the array
     */
    public int sumArray(int[] myArray){
      int total = 0;
      
      for(int i = 0; i < myArray.length; i++){
        total += myArray[i];
      }
      
      return total;
    }     
}
```
![](fig1.png)

## Modifying an array within a method
Since arrays are passed as a reference, making changes to the parameter array will affect the array at the calling program

```java
public class Program2 extends ConsoleProgram {
    public void run() {
      // Intialize integer array
      int[] intArray = {5, 6, 7, 8}; 

      // Use increaseFirst to modify intArray
      increaseFirst(intArray, 3);

      // Print out the first element in the array
      System.out.println(intArray[0]);
    }
    
    /**
     * Increases the first element in an array by a specified amount
     * @param myArray   array of integers
     * @param increase  specified amount to increase by
     */
    public void increaseFirst(int[] myArray, int increase){
      myArray[0] = myArray[0] + increase;    
    }   
}
```
![](fig2.png)

## Arrays as Return values
We can also form arrays in a method and return them.  

### Example
Write a method `firstLast` that returns an array consisting of the first and last elements of the parameter `fullArray`. Call this in the `run()` method to test it.

```java
public class Program3 extends ConsoleProgram{
    public void run() {
      // Initialize arrays
      int[] fullArray = {5,6,7,8}; 
      int[] newArray = firstLast(fullArray);
      
      // Print elements of the new Array
      for (int i = 0; i < newArray.length; i++) {
        System.out.println(newArray[0]);
      }
    }
    
    /**
     * Creates an array of the first and last element of a given array
     * @param fullArray   array of ints
     * @return a new array with only the first and last element
     */
    public int[] firstLast(int[] fullArray){
      int[] result = new int[2];
      
      result[0] = fullArray[0];
      result[1] = fullArray[fullArray.length - 1];
      
      return result;
    }
    
}



