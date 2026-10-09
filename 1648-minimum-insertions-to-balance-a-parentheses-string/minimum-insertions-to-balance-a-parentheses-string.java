class Solution {
    public int minInsertions(String s) {
        int need = 0;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                if(need % 2 == 1){
                    count++;
                    need--;
                }
                need += 2;
            }
            else{
                need--;
                if(need < 0){
                    count++;
                    need = 1;
                }
            }
        }
        return need + count;
    }
}