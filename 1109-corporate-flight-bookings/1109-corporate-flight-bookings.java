class Solution 
{
    public int[] corpFlightBookings(int[][] bookings, int n) 
    {
        int arr[] = new int[n];
        for (int i = 0; i < bookings.length; i++) 
        {
            arr[bookings[i][0] - 1] += bookings[i][2];
            if (bookings[i][1] < n) {
                arr[bookings[i][1]] -= bookings[i][2];

            }
        }
        for (int j = 1; j < n; j++) 
        {
            arr[j] += arr[j - 1];
        }
        return arr;
    }
}