class unionIntersection{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> set1 = new HashSet<Integer>();
        for(int i : a)
            set1.add(i);
        
        for(int i : b)
            set1.add(i);
        
        return set1.size();
    }
    
    public int doIntersection(int[] a, int n, int[] b, int m) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }

        List<Integer> result = new ArrayList<>();

        for (int i : b) {
            if(set.contains(i)){
                result.add(i);
                set.remove(i);
            }
        }

        return result.size();
    }
}
