class minJump{
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
        int jumps = 1;
        
        if(n == 1 )
            return -1;
            
        if(arr[0] == 0)
            return -1;
            
        int farthest = arr[0];
        int curr_end = arr[0];
        
        for(int i = 1; i < n; i++){
            if(i > farthest)
                return -1;
                
            if(i == n - 1)
                return jumps;
                
                farthest = Math.max(farthest, i + arr[i]);
                
                if(i == curr_end){
                    jumps++;
                    curr_end = farthest;
                }
        }
        return jumps;
    }
}
