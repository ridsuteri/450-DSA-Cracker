class rearrange {
    
    public void segregateElements(int arr[], int n)
    {
        int left = 0;
        int right = n - 1;
        
        while(left <= right){
            
            if(arr[left] > 0 && arr[right] < 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
            
            else if(arr[left] < 0 && arr[right] < 0){
                left++;
            }
            
            else if(arr[left] > 0 && arr[right] > 0){
                right --;
            }
            
            else{
                left++;
                right--;
            }
        }
        
        
    }
}
