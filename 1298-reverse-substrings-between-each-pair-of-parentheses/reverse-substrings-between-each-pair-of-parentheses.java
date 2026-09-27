class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            String str = "";
            if(s.charAt(i) == ')'){
                while(st.peek() != '('){
                    str += st.pop();
                }
                st.pop();
                for(int j=0; j<str.length(); j++){
                    st.push(str.charAt(j));
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String result = "";

        for(int i=0; i<st.size(); i++){
            result += st.get(i);
        }
        return result;
    }
}