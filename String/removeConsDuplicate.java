class removeConsDuplicate{
    public String removeConsecutiveCharacter(String S){
        if(S.length() == 1)
            return S;
        
        String small = removeConsecutiveCharacter(S.substring(1));
        
        if(S.charAt(0) == small.charAt(0))
            return small;
        
        else
            return S.charAt(0) + small;
    }
}
