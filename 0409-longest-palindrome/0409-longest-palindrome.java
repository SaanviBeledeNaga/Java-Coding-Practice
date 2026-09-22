class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);

            }
            else
            {
                map.put(ch, 1);
            }
              if((map.get(ch) % 2) == 0)
              {
                res += 2;
              }
        }
        if(s.length() == res)
        {
            return res;
        }
        return res + 1;    
    }
}