class findDuplicate {
//     FLYOD TORTOISE METHOD - for immutable 
     public int findDuplicate(int[] arr){
        int slow = arr[0];
		int fast = arr[0];

		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		} while (slow != fast);

		fast = arr[0];

		while (slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
        return slow;
    }
    
    public int findDuplicate(int[] nums) {
        int n =  nums.length;
        for(int i = 0; i < n; i++)
            nums[nums[i] % n] += n;
        
        for(int i = 0; i < n; i++){
            if(nums[i]/n > 1)
                return i;
        }
        
        return -1;
    }
}
