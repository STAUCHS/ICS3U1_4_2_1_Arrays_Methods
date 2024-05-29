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