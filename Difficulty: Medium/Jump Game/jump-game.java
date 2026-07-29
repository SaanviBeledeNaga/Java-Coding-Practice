class Solution {
    public boolean canReach(int[] arr) {
        int goal = arr.length - 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (i + arr[i] >= goal) {
                goal = i;
            }
        }
        return goal == 0;        
    }
}