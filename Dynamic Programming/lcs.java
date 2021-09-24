class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int[][] memo = new int[x+1][y+1];
        for(int[] i: memo)
	    {
	        Arrays.fill(i,-1);
	    }
        return lcsHelper(x,y,s1,s2,memo);
    }
    
    static int lcsHelper(int x, int y, String s1, String s2,int [][]memo){
        
        if(memo[x][y]!=-1)
            return memo[x][y];
            
        if(x == 0 || y == 0)
            memo[x][y] = 0;
            
        else{
            int res ;
            
            if(s1.charAt(x-1) == s2.charAt(y-1))
                res = 1+ lcsHelper(x-1,y-1,s1,s2,memo);
            else
            res = Math.max(lcsHelper(x-1,y,s1,s2,memo),lcsHelper(x,y-1,s1,s2,memo));
            
            // System.out.println(res);
            memo[x][y] = res;
        }
        
        return memo[x][y];
    }
}