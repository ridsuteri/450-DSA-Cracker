class kadaneAlgo{
  int maxSubarraySum(int arr[], int n){
        
        int meh = 0;
        int msf = Integer.MIN_VALUE;
        
        for(int i: arr){
            meh += i;
            
            if(meh < i)
                meh = i;
                
            if(meh > msf)
                msf = meh;
        }
        
        return msf;
        
    }
    
}
