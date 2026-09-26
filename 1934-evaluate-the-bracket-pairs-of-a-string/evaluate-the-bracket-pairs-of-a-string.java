class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();

        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        String result = "";

        for(int i=0; i<s.length(); i++){
            String key = "";

            if(s.charAt(i) == '('){
                i++;

                while(s.charAt(i) != ')'){
                    key += s.charAt(i);
                    i++;
                }
                if(map.containsKey(key)){
                    result += map.get(key);
                }
                else{
                    result += '?';
                }
            }
            else{
                result += s.charAt(i);
            }
        }
        return result;
    }
}