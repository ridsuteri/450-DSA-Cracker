class subarray0{
    static boolean findsum(int arr[],int n){
        Set<Integer> map = new HashSet<>();
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

        if (map.contains(sum) || sum == 0 ){
          return true;
        }
        map.add(sum);
      }
      return false;
    }
}
