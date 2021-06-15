class Solution
{
    public static void sort012(int arr[], int n)
    {
        int nextTwo=arr.length-1;
        int nextZero=0;
        
        int i=0;
        while(i<=nextTwo){
            if(arr[i]==2){
                int temp=arr[i];
                arr[i]=arr[nextTwo];
                arr[nextTwo]=temp;
                nextTwo--;
            }
            
            else if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[nextZero];
                arr[nextZero]=temp;
                nextZero++;
                i++;
            }
            
            else
                i++;
            
        }
    }
}
