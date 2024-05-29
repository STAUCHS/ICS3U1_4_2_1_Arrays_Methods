public class Program1 extends ConsoleProgram {
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