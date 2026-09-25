class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String [] words = s.split(" ");
        char [] arr = pattern.toCharArray();
        if(arr.length != words.length){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            if(map1.containsKey(arr[i])){
                if(!map1.get(arr[i]).equals(words[i])){
                    return false;
                }
            }
            else{
                map1.put(arr[i], words[i]);
            }
            if(map2.containsKey(words[i])){
                if(map2.get(words[i]) != arr[i]){
                    return false;
                }
            }
            else{
                map2.put(words[i], arr[i]);
            }
        }
        return true;
    }
}