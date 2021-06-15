class rotateBy1{
    
    public void rotate(long arr[], long n)
    {
        int N = (int)n;
        long temp = arr[N - 1];
        long t = arr[0];
        for(int i = N-1; i > 0; i--){
             arr[i] = arr[i-1];
        }
        
        arr[0] = temp;
    }
}
