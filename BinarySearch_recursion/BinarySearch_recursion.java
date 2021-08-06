/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;    
import java.util.*;

/**
 *
 * @author BILAWAL ALI
 */
public class BinarySearch_recursion {

  public static void main(String[] args)   
  {
    int[] arr=new int[10];
    for(int i=0; i<arr.length; i++)
    {
      arr[i]=i;
       System.out.print(arr[i]+",");
    }
    int find=BinarySearch(arr,9,0,arr.length-1);
    System.out.println(" \nFound:"+find);
  }
  
  public static int BinarySearch(int[] a, int key, int first, int last) 
  {
    int mid=(first+last)/2;
    if(last<first)
      return -1;
      if(a[mid]>key)
       return BinarySearch(a,key,first,mid-1);
        if(a[mid]<key)
       return BinarySearch(a,key,mid+1,last);
        if(key==a[mid])
       return mid;
     return -1;
  }
}
    
