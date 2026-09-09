class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(smap.containsKey(sch))
            {
                if(tch!=smap.get(sch))
                {
                    return false;
                }
            }
            else
            {
                smap.put(sch,tch);
            }
            if(tmap.containsKey(tch))
            {
                if(sch!=tmap.get(tch))
                {
                    return false;
                }
            }
            else
            {
                tmap.put(tch,sch);
            }
        }
        return true;
    }
}