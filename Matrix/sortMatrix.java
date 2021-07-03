class sortMatrix {
    int[][] sortedMatrix(int N, int Mat[][]) {
        
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                a.add(Mat[i][j]);
            Collections.sort(a);
            
        int k = 0;
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                Mat[i][j] = a.get(k++);
                
        return Mat;
    }
}
