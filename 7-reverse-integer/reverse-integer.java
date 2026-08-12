class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        StringBuilder sb = new StringBuilder(s);
        int i=0; 
        int j = sb.length()-1;
        if(sb.charAt(i) == '-'){
            i = 1;
        }
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }
        try{
            return Integer.parseInt(sb.toString());
        }
        catch(Exception e){
            return 0;
        }
    }
}