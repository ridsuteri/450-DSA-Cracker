class maxProductSubArr {
    long maxProduct(int[] nums, int n) {
        long maxSoFar = nums[0];
        long minSoFar = nums[0];
        long maxOverall = nums[0];
        long prevMaxSoFar = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            prevMaxSoFar = maxSoFar;
            
            maxSoFar = Math.max(nums[i], Math.max(nums[i]*maxSoFar, nums[i]*minSoFar));
            
            minSoFar = Math.min(nums[i], Math.min(nums[i]*minSoFar, prevMaxSoFar*nums[i]));
            
            maxOverall = Math.max(maxOverall, maxSoFar);
        }
       return maxOverall;
    }
}
