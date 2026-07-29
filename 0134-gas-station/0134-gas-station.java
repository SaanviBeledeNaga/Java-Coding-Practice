import java.util.Arrays;
class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int pos = 0;
        int currgas = 0;
        int sum_gas = Arrays.stream(gas).sum();
        int sum_cost = Arrays.stream(cost).sum();
        if(sum_gas<sum_cost)
        {
            return -1;
        }
        else
        {
            for(int i=0;i<cost.length;i++)
            {
                currgas += gas[i] - cost[i];
                if(currgas<0)
                {
                    pos = i + 1;
                    currgas = 0;
                }
            }
            return pos;
        }
    }
}