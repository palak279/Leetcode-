class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int barCount = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '|'){
                barCount++;
            }
            else if(s.charAt(i) == '*' && barCount % 2 == 0){
                count++;
            }
        }
        return count;
    }
}