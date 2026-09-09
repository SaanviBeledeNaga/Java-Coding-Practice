class Solution {
    public String decodeMessage(String key, String message) 
    {
        Map<Character, Character> map = new HashMap<>();
        char currch= 'a';    
        map.put(' ' , ' ');
        for(char ch : key.toCharArray())
        {
            if(Character.isLetter(ch))
            {
                if(!map.containsKey(ch))
                {
                    map.put(ch, currch);
                    currch++;
                }
            }
            else
            {
                map.put(' ' , ' ');

            }
        }
        String res = "";
        for(char ch: message.toCharArray())
        {
            res+=map.get(ch);
        }
        return res;
    }
}