public class Program3 extends ConsoleProgram{
    public void run() {
    
      int[] fullArray = {5,6,7,8}; 
      
      int[] newArray = firstLast(fullArray);
      
    }
    
    public int[] firstLast(int[] fullArray){
      int[] result = new int[2];
      
      result[0] = fullArray[0];
      result[1] = fullArray[fullArray.length - 1];
      
      return result;
    }
    
}