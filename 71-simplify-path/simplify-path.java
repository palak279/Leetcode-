class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String [] arr = path.split("/");

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("") || arr[i].equals(".")){
                continue;
            }
            else if(arr[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(arr[i]);
            }
        }
        String result = "";
        for(int i=0; i<st.size(); i++){
            result += '/' + st.get(i);
        }
        if(result.equals("")){
            return "/";
        }
        return result;
    }
}