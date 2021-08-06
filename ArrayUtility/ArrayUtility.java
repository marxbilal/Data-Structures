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
public class ArrayUtility {
    
public static int[] arr=new int[10];
  public static int[] arr1={1,2,3,4,5,6,7,8,9};
  public static int[][] towDarr=new int[2][2];
  
  public static void main(String[] args) 
  { 
    
    for(int i=0; i<arr.length; i++)
    {
      arr[i]=(int)(Math.random()*10+1);
      System.out.print(arr[i]+",");
    }
    int a=findMax(arr,0,arr.length-1);
    System.out.println("\nMax value is: "+a);
    
    int b=findMaxPos(arr,0,arr.length-1);
    System.out.println("Max position is at: "+b);
    
    int c=findMin(arr,0,arr.length-1);
    System.out.println("Min value is: "+c);
    
    int d=findMinPos(arr,0,arr.length-1);
    System.out.println("Min position is at: "+d);
    
    swap(arr, 0, arr.length-1);
    System.out.println();
    
    shiftRight(arr,0,arr.length);
    System.out.println();
    
    shiftLeft(arr,0,arr.length-1);
    System.out.println();
    
    System.out.print("Create random Array: ");
    createRandomArray(10,3,10); 
    
    System.out.println("\nCreate random Matrix: ");
    createRandomMatrix(3,3,10,20);
    //System.out.println();
    
    copyArray(arr);
    
    copyMatrix(towDarr);
    
    int find=findInArray(arr,4); 
    System.out.println(" \nElement found at:"+find);
    
    int findSort=findInSortedArrary(arr1, 6);
    System.out.println("Element found in Sorted array at:"+findSort);
    
    int findFirstSort=findFirstInSortedArrary(arr1, 4);
    System.out.println("Element found in First Sorted array at:"+findFirstSort);
    
    
    
  }
  
  public  static int findMax(int[] A, int i, int j)
  {
    int max=A[i];
    for(int x=i; x<j; x++)
    {
      if(A[x+1]>max)
        max=A[x+1];
    }
    return max;
    
  }
  public static int findMaxPos(int[] A, int i, int j)
  {
    int max=A[i];
    int index=0;
    for(int x=i; x<j; x++)
    {
      if(A[x+1]>max){
        max=A[x+1];
        index=x+1;
      }
    }
    return index;
  }
  public static int findMin(int[] A, int i, int j)
  {
    int min=A[i];
    for(int x=i; x<j; x++)
    {
      if(A[x+1]<min)
        min=A[x+1];
    }
    return min; 
  }
  public static int findMinPos(int[] A, int i, int j)
  {
    int min=A[i];
    int index=0;
    for(int x=i; x<j; x++)
    {
      if(A[x+1]<min)
      {  min=A[x+1];
        index=x+1;
      }
      
    }
    return index;
  }
  
  public static void swap(int[] A, int i, int j)
  {
    int temp;
    temp=A[i];
    A[i]=A[j];
    A[j]=temp; 
    for(int a=0; a<A.length; a++)
    {
      System.out.print(A[a]+",");
      
    }
    
  }
  public static void shiftRight(int[] A, int i, int j)
  {
    int temp=A[j-1];
    for(int a=j-1; a>0; a--) 
    {
      A[a]=A[a-1];
      
    }
    A[0]=temp;
    System.out.print("Sfift Right: ");
    for(int k=0; k<j; k++)
    {
      System.out.print(A[k]+",");
    }
    
  }
  public static void shiftLeft(int[] A, int i, int j)
  {
    int temp=A[0];
    for(int a=i; a<j ; a++)
    {
      A[a]=A[a+1];
    }
    A[j-1]=temp;
    System.out.print("Sfift leeft: ");
    for(int k=0; k<=j; k++)
    {
      
      System.out.print(A[k]+",");
    }
    
    System.out.println();
    
  }
  public static void createRandomArray(int size,int min,int max)
  {
    int[] Arr=new int[size];
    for(int i=0; i<size; i++)
    {
      Arr[i]=(int)(min+(Math.random()*max));
      System.out.print(Arr[i]+",");
      
    }
    
  }
  public static void createRandomMatrix(int rows, int cols, int min, int max)
  {
    int[][] twoDarr=new int[rows][cols];
    for ( int i =0; i < twoDarr.length; i++) {
      for (int j = 0; j < twoDarr[i].length; j++) {
        twoDarr[i][j] = (int)(Math.random()*max);
        System.out.print(twoDarr[i][j]+",");
      }
    }
    
  }
  public static void copyArray(int[] A)
  {
    int[] B=new int[A.length];
    B=A;
    System.out.println("\nElements of Array A: ");
    for(int i=0; i<A.length; i++)
      System.out.print(A[i]+",");
    System.out.println("\nNow copied elements in B: ");
    for(int i=0; i<B.length; i++)
      System.out.print(B[i]+",");
  }
  public static void copyMatrix(int[][] A)
  {
    
    int[][] B=new int[A.length][A[0].length];
    
    System.out.println("\nElements of Array A: ");
    for ( int i =0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        A[i][j] = (int)(Math.random()*10);
        System.out.print(A[i][j]+",");
      }
    }
    for(int i=0; i<A.length; i++)
      for(int j=0; j<A[i].length; j++)
      B [i][j]=A[i][j];
    System.out.println("\nNow copied elements in B: ");
    for ( int i =0; i < B.length; i++) {
      for (int j = 0; j < B[i].length; j++) {
        System.out.print(B[i][j]+",");
      }
    }
  }
  public static int findInArray(int[] A, int q)
  {
    
    for(int i=0; i<A.length; i++)
    {
      if(A[i]==q)
        return i;
    }
    return -1;
  }
  public static int findInSortedArrary(int[] A, int q)
  {
    
    int f = 0;
    int l = A.length - 1;
    int mid = (f + l) / 2;
    while (f < l)
    {  
      if (A[mid] > q)
        l = mid - 1;
      else if(A[mid]==q)
        return mid; 
      else
        f = mid + 1;
      mid = (f + l) / 2;
      
    }
    if (A[mid] == q)
      return mid; 
    else
      return -1;
  }
  public static int findFirstInSortedArrary(int[] A, int q) 
  {
    for(int i=0; i<A.length; i++)
    {
      if(A[i]==q)
      {
        return i;
      }
    }
    return -1;
    
  }
  
  
}
