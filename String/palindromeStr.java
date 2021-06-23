class palindromeStr {
    int isPlaindrome(String S) {
        // code here
        int j = S.length() - 1;
        
        for(int i = 0; i <= j; i++, j--){
            if(S.charAt(i) != S.charAt(j))
                return 0;
        }
        return 1;
    }
};
