static class Pair {

		int min;
		int max;
	}

public static Pair maxminpair(int[] arr, int n) {
	Pair maxmin = new Pair();
	int i = 0, j = 0;
	if (n % 2 == 0) {
		i = 0;
		j = 1;
	} 
  else
			i = j = 0;
	
	while (j < arr.length) {
	  if (arr[i] < arr[j]) {
			if (maxmin.min > arr[i])
				maxmin.min = arr[i];
			if (maxmin.max < arr[j])
				maxmin.max = arr[j];
		} 
    else {
			if (maxmin.min > arr[j])
				maxmin.min = arr[j];
			if (maxmin.max < arr[i])
				maxmin.max = arr[i];
		}
	  i++;
	  j++;
	}

	return maxmin;

}
