class arraySubset {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Set<Long> s = new HashSet<>();
        
        for(long i : a1)
            s.add(i);
            
        for(long i : a2)
            if(!s.contains(i))
                return "No";
        
        return "Yes";
   
    }
}
