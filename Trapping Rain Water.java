class Solution{
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        long res = 0;
        lMax[0] = arr[0];
        for (int i = 1; i<n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i-1]);
        }
        rMax[n-1] = arr[n-1];
      
        for (int i = n-2; i>=0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i+1]);
        }
        for (int i = 1; i<n-1; i++) {
            res += Math.min(lMax[i], rMax[i]) - arr[i];
        }
        return res;
    } 
}
