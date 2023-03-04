class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int prev = -1,minIndex = -1,maxIndex = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < minK || nums[i] > maxK){
                prev = i;
                minIndex = i;
                maxIndex = i;
            }
            else{
                if(minK == nums[i]){
                    minIndex = i;
                }
                if(maxK == nums[i]){
                    maxIndex = i;
                }
            }
            ans += Math.min(minIndex,maxIndex) - prev;
        }
        return ans;
    }
}
