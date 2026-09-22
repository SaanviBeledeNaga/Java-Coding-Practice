class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chset = s.toCharArray();
            Arrays.sort(chset);
            String key = new String(chset);
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> val : map.values())
        {
            res.add(val);
        }
        return res;
        
    }
}