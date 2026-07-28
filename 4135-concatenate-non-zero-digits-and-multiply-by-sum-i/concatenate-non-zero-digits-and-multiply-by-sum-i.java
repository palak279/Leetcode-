class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '0'){
                sb.append(s.charAt(i));
            }
        }
        if(sb.length() == 0){
            return 0;
        }
        int sum = 0;
        String temp = sb.toString();
        for(int i = 0; i < temp.length(); i++) {
            sum += temp.charAt(i) - '0';
        }
        long x = Long.parseLong(temp);

        return x * sum;
    }
}