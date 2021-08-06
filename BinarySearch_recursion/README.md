# Implement Binary Search using Recursion

Locate the element x in a sorted array by first comparing x with the middle element and
then (if they are not equal) dividing the array into two subarrays and repeat the whole
procedure in one of them. If x is less than the middle element you search in the left subarray,
otherwise - in the right subarray.


Algorithm:


public int BinarySearch(int[] a, int key, int left, int right) {  
 Base case is defined as when no more items in the list to search ( or end
of list) then return -1  
 Compute mid value  
 Recursive Case:  
a.  if key is found at mid== a[mid]) return mid;  
b.  if key is greater than the mid value then continues to search in  
the right half of the list, and return.  
c.  If key is less than the mid value then continues to search in the  
left half of the list, and return.
 }
