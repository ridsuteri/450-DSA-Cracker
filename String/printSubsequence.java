class printSubsequence{
 
    public subsequences(String s, String ans){
      if (s.length() == 0){
          System.out.println(ans);
          return;
      }
      
      char a = s.CharAt(0);
      subsequences(s.substring(1);, ans + a);
      subsequences(s.substring(1);, ans);
  }
}
