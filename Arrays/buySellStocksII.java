class buySellStocksII{ 
  public static int maxProfit(int[] arr){
        int misf = arr[0];
        int[] ps = new int[arr.length];
        for(int i = 1; i < arr.length; i++){
           if(arr[i] < misf){
              misf = arr[i];
           }

           if(arr[i] - misf > ps[i - 1]){
              ps[i] = arr[i] - misf;
           } else {
              ps[i] = ps[i - 1];
           }
        }

        int masf = arr[arr.length - 1];
        int[] pb = new int[arr.length];
        for(int i = arr.length - 2; i >= 0; i--){
           if(arr[i] > masf){
              masf = arr[i];
           }

           if(masf - arr[i] > pb[i + 1]){
              pb[i] = masf - arr[i];
           } else {
              pb[i] = pb[i + 1];
           }
        }

        int mp = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
           if(ps[i] + pb[i] > mp){
              mp = ps[i] + pb[i];
           }
        }
  }
}
