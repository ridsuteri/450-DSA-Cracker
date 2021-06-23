public class commonElements {
  
	public static void common(int[][] m) {
		Map<Integer, Integer> mp = new HashMap<>();

		for (int i = 0; i < m[0].length; i++) {
			mp.put(m[0][i], 1);
		}

		for (int i = 1; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (mp.get(m[i][j]) != null && mp.get(m[i][j]) == i) {
					mp.put(m[i][j], i + 1);

					if (i == m.length - 1)
						System.out.print(m[i][j] + " ");
				}
			}
		}

	}

}
