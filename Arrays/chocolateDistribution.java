class chocolateDistribution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        if (m == 0 || n == 0)
            return 0;
        
        Collections.sort(a);
        long min =Integer.MAX_VALUE ;
        for (long i = 0; i + m - 1 < n; i++)
        {
            long diff = a.get((int)(i+m-1)) - a.get((int)i);
            if (diff < min)
                min = diff;
        }
        return min;
    }
}
