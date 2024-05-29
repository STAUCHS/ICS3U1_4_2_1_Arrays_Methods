public class Program2 extends ConsoleProgram {
    public void run() {
    
      int[] intArray = {5,6,7,8}; 

      increaseFirst(intArray, 3);
      System.out.println(intArray[0]);
      
    }
    
    public void increaseFirst(int[] myArray, int increase){
      myArray[0] = myArray[0] + increase;    
    }
    
}