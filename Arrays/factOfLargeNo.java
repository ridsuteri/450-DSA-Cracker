class factOfLargeNo {
    static void multiply(int n , ArrayList<Integer> number){
        int carry = 0;
        for (int i = 0; i < number.size(); i++) {
            int num = n * number.get(i);
            number.set(i,(num + carry) % 10);
            carry = (num + carry) / 10;
        }
        while (carry != 0) {
            number.add(carry % 10);
            carry /= 10;
        }
    }
    
    ArrayList<Integer> factorial(int N){
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(1);
        for (int i = 2; i <= N; i++) 
            multiply(i, number);
        
        Collections.reverse(number); 
        return number;
    }
}
