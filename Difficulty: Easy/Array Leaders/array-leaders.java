class Solution {
    static ArrayList<Integer> leaders(int arr[]) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int maxRight = arr[arr.length-1];
        ans.add(maxRight);
        
        for(int i= arr.length-2; i>=0; i--)
        {
            if(arr[i]>=maxRight)
            {
                maxRight = arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
