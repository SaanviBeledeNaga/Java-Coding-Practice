class Solution 
{
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public int countCoPrime(int[] arr) 
    {
        int count = 0;
        for(int i =0;i<arr.length-1;i++)
        {
            if(gcd(arr[i],arr[i+1])!=1)
            {
                count++;
            }
        }
        return count;
    }
}