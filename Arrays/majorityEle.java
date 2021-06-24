class majorityEle {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0, c2=0;
        Integer m1=null, m2=null;
        
        //Finding numbers with top two frequencies in nums[]
        for(int i=0; i<nums.length; i++){
            
            if(m1!=null && m1==nums[i])
                c1++;
            else if(m2!=null && m2==nums[i])
                c2++;
            else if(c1==0){
                m1 = nums[i];
                c1++;
            }
            else if(c2==0){
                m2 = nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }                
        }
        
        //Finding the actual count of the two nums found
        c1=0; c2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==m1)
                c1++;
            else if(nums[i] ==m2)
                c2++;
        }
        
        List<Integer> res = new ArrayList<>();
        
        //checking whether the count of the two numbers found is greater than ceil(nums.length/3)
        if(c1> Math.ceil(nums.length/3)) res.add(m1);
        if(c2 > Math.ceil(nums.length/3)) res.add(m2);
        
        return res;
    }
}
