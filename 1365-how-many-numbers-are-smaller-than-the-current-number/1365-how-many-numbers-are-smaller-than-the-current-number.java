class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        int[] acc = new int[101];
        int[] res = new int[n];
        for(int i=0;i<n;i++)
        {
            freq[nums[i]] = freq[nums[i]]+1;

        } 
          acc[0] = freq[0];
        for(int i=1;i<freq.length;i++)
        {
            acc[i] = acc[i-1]+freq[i];
        }
     
        for(int i=0;i<n;i++)
        {
            if (nums[i] == 0)
                res[i] = 0;
               else 
            res[i] = acc[nums[i]-1];
        
        }
        return res;
    
   
}
}