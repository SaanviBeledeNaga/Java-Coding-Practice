class Solution 
{
    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,int r) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<l-1;i++)
        {
            ans.add(arr.get(i));
        }
        for(int i = r-1;i>=l-1;i--)
        {
            ans.add(arr.get(i));
        }
        for(int i = r;i<arr.size();i++)
        {
            ans.add(arr.get(i));
        }
        return ans;
    }
}