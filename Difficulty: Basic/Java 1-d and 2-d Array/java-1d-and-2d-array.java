class Complete 
{
    public static ArrayList<Integer> array(int a[][], int b[], int n) 
    {
        int sum = 0;
        int max = b[0];
        for(int i = 0;i<n;i++)
        {
            sum+=a[i][i];
        }
        for(int i = 0;i<n;i++)
        {
            if(max<b[i])
            {
                max = b[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(sum);
        ans.add(max);
        return ans;
    }
}
