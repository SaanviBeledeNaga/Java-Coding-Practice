import java.util.Scanner;
class Solution {
    int returnValueFunction(int n)
    {
        return n*2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
       int result = obj.returnValueFunction(n);
       System.out.println(result);
    }
}