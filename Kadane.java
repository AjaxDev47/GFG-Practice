package ajax;

public class Kadane{
  
  public static void main(String args[]){
      int[] A = {1, 2, 3, -2, 5};
      
      int N = A.length;
      int sum = 0;
      int maxSum = Integer.MIN_VALUE;
      
      for(int i = 0; i < N; i++){
          sum = sum + A[i];
          
          if(sum > maxSum)
            maxSum = sum;
            
          if(sum < 0)
            sum = 0;
      }
      
      System.out.println(maxSum);
  }
}
