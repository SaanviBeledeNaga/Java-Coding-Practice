import java.util.*;
class Solution 
{
    public ArrayList<Integer> getTriangle(int[] arr) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        while(arr.length>0)
        {
            for(int i=arr.length-1;i>=0;i--)
            {
               list.add(arr[i]);
            }
            if(arr.length == 1)
            break;
            int[] temp = new int[arr.length-1];
            for(int i =0;i<arr.length-1;i++)
            {
                temp[i]= arr[i]+arr[i+1];
            }
            arr = temp;
        }
        Collections.reverse(list);
        return list;
    }
}