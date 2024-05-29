public class Program1 extends ConsoleProgram {
  public void run() {
  
  int[] intArray = {5,6,7,8};
  
  int sum = sumArray(intArray);
  
  System.out.println(sum);
  }
  
  public int sumArray(int[] myArray){
    int total = 0;
    
    for(int i = 0; i < myArray.length; i++){
      total = total + myArray[i];
    }
    
    return total;
  }     
}