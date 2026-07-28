import java.util.Scanner;
class Solution {
    public static void printPrimeFactorization(int n) {
        for(int i=2;i<=n;i++)
        {
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        
    }
}
