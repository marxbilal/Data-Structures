/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

/**
 *
 * @author BILAWAL ALI
 */
public class MaxSort_running_time_complexity {
    
static int tempVar;
  public static void main(String[] args) 
  {
    MaxSort_running_time_complexity obj = new MaxSort_running_time_complexity();
    int[] arr= new int[10];
    System.out.print("The given Array is: ");
    for (int i = 0; i <arr.length ; i++)
    {
      arr[i]=(int)(Math.random()*10+1);
    }
    System.out.print( obj.toString(arr));
     long startTime = System.nanoTime();
    obj.maxSortShifRight(arr);
    long estimatedTime = System.nanoTime()-startTime;
    System.out.println("\nThe sorted array in descending order is: " + obj.toString(arr) );
    System.out.println("Estimated Time of MaxSort in ShiftRight method is: "+estimatedTime +" ns");
    // Different Estimated Time of ShifRight Methods 1- 22169 ns, 2- 20527 ns, 3-25454 ns.
    
     startTime = System.nanoTime();
    obj.maxSortSwap(arr);
     estimatedTime = System.nanoTime()-startTime;
    System.out.println("\nThe sorted array in descending order is: " + obj.toString(arr) );
    System.out.println("Estimated Time of MaxSort in Swap method is: "+estimatedTime+" ns");
    // Different Estimated Time of ShifRight Methods 1- 15544 ns, 2- 18554 ns, 3-22156 ns.
    
    
  }
  public static int findMaxPosSwap(int [] A, int i, int j)
  {                  
    int max=A[i];
    int index=i;
    for(int x=i; x<j; x++)
    {
      if(A[x+1]>max){
        max=A[x+1];
        index=x+1;
      }
    }
    return index;
  }
  public static void maxSortSwap(int[] A){  
    
    for(int i=0; i<A.length; i++){
      int maxPos = findMaxPosSwap(A, i, A.length-1); 
      swap(A, i, maxPos);       
    }
    
  }
  
  public static void swap(int[] A, int i, int j){
    
    int tmp;               
    
    tmp = A[i];
    A[i] = A[j];
    A[j] = tmp; 
    
  }
  
  public static void maxSortShifRight(int[] A)
  {
    
    for(int i=0; i<A.length; i++){
      int maxPos = findMaxPosShift(A, i, A.length-1); 
      ShiftRight(A, i, maxPos); 
      
    }
  }
  public static void ShiftRight(int[] A, int i, int j)
  {
    int temp=A[j];
    for(int a=j; a>0; a--) 
    {
      A[a]=A[a-1];
      
    }
    A[0]=temp;
  }
   public static int findMaxPosShift(int [] A, int i, int j)
  {                  
    int max=A[i];
    int index=i;
    for(int x=i; x<j; x++)
    {
      if(A[x+1]<max){
        max=A[x+1];
        index=x+1;
      }
    }
    return index;
  }
  public String toString(int[] A)
  {
    String str= "[ ";
    for (int i = 0; i < A.length; i++) 
    {
      str+= A[i] +" ";
    }
    return str+"]";
  }
}


