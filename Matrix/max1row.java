class max1row {
     int rowWithMax1s(int arr[][], int n, int m) {
        int r = 0;             
        int c = m-1;            
        int max_row_index=-1;   
        
        
        while(r<n && c>=0)
        {
            if(arr[r][c]==1)
            {
                max_row_index = r;
                c--;
            }
            else
                r++;
        }
        return max_row_index;
    }
}
