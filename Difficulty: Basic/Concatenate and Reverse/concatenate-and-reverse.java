class Solution 
{
    static String conRevstr(String s1, String s2) 
    {
        String s3 = s1.concat(s2);
        String s4 = "";
        for(int i =s3.length()-1;i>=0;i--)
        {
            s4 = s4 + s3.charAt(i);
        }
        return s4;
    }
}