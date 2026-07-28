import java.util.*;
class Solution 
{
    static int areAnagram(String S1, String S2) 
    {
        if(S1.length()!=S2.length())
        {
            return 0;
        }
        char[] a = S1.toCharArray();
        char[] b = S2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b) ? 1:0;
    }
}