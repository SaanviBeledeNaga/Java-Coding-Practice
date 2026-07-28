import java.util.*;
class Solution 
{
    public int maxPerimeter(int[] arr) 
    {
       Arrays.sort(arr);
       int perimeter = 0;
       for(int i = arr.length-3;i>=0;i--)
       {
           if(arr[i]+arr[i+1]>arr[i+2])
           {
               return perimeter = arr[i]+arr[i+1]+arr[i+2];
           }
       }
       return -1;
    }
}