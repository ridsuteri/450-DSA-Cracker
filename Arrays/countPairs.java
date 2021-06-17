class countPairs {
    int getPairsCount(int[] arr, int n, int k) {
       Map<Integer, Integer> temp = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (temp.containsKey(arr[i])) {
				temp.put(arr[i], temp.get(arr[i]) + 1);
			} else {
				temp.put(arr[i], 1);
			}
		}
		int sumpair = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp.containsKey(k - arr[i])) {
				sumpair += temp.get(k - arr[i]);
			}
			if (k - arr[i] == arr[i]) {
				sumpair--;
			}
		}

        return sumpair / 2;
    }
}
