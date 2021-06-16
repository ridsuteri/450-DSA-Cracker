class tripletSum{
    
    public static boolean find3Numbers(int A[], int n, int X) { 
		Arrays.sort(A);
		for (int i = 0; i < n - 2; i++) {
			int j = i + 1, k = n - 1;
			int nowsum = X - A[i];
			while (j < k) {
				if (nowsum < A[j] + A[k]) {
					k--;
				} else if (nowsum > A[j] + A[k]) {
					j++;
				} else {
					return true;
				}
			}

		}
		return false;
    }
}
