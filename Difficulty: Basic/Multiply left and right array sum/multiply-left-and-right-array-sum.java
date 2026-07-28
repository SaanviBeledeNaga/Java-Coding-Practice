class Solution 
{
    public int multiply(int[] arr) 
    {
        int n = arr.length;
        int sumleft = 0;
        int sumright = 0;
        for(int i =0;i<n/2;i++)
        {
                
            sumleft+=arr[i];
        }
        for(int j=n/2;j<n;j++)
        {
            sumright+=arr[j];
        }
        int ans = sumleft*sumright;
        return ans;
    }
}
      