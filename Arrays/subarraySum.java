class subarraySum {

    public static int sb(int arr[], int n, int sum) {
        // Your code goes here 
        int i = 0, j = 0, x = 0, min = Integer.MAX_VALUE;
		while (i < arr.length && j < arr.length) {

			while (x <= sum && j < arr.length) {
				x += arr[j];
				j++;
			}
			while (x > sum && i < arr.length) {
				int ml = j - i;
				if (ml < min) {
					min = ml;
				}
				x -= arr[i];
				i++;

			}

		}
		return min;
    }
}
