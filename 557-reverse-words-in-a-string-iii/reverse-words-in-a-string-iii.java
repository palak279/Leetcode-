class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        String str = "";

        for(int i=0; i<words.length; i++){
            String word = words[i];
            for(int j= word.length()-1; j>=0; j--){
                str += word.charAt(j);
            }
            if(i != words.length - 1){
                str += " ";
            }
        }
        return str;
    }
}