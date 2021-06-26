class rotationstring {
    public static void rotations(String s1, String s2) {
        String temp = s1.concat(s1);
        if (temp.contains(s2))
          System.out.println(true);
      
        else
          System.out.println(false);
    }
}
