class threeWayPart{
    public void threeWayPartition(int array[], int a, int b)
    {
        int n = array.length;
        int start = 0, end = n-1;
        
        for(int i = 0; i <= end;){
            
            if(array[i] < a){
                swap(array, start, i);
                start++;
                i++;
            }
            
            else if(array[i] > b){
                swap(array, end, i);
                end--;
            }
            
            else
                i++;
        }
    }
    
    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
