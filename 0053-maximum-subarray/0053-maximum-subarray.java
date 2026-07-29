class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int ms=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            
            cs=Math.max(cs+nums[i],nums[i]);
            ms=Math.max(ms,cs);
        }
        return ms;
    }
}