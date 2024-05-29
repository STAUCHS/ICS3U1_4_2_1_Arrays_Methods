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