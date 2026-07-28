class Solution 
{
    public long totalFine(int date, int car[], int fine[]) 
    {
        int fees = 0;
        for(int i =0;i<fine.length;i++)
        {
            if(car[i]%2!=0 && date%2==0)
            {
                fees+=fine[i];
            }
            if(car[i]%2==0 && date%2!=0)
            {
                fees+=fine[i];
            }
        }
        return fees;
    }
}