class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack<>();

        for(int i=0; i<asteroids.length; i++){
            while(!st.isEmpty() && st.peek() > 0 && asteroids[i] < 0){
                if(st.peek() < -asteroids[i]){
                    st.pop();
                }else if(st.peek() == -asteroids[i]){
                    st.pop();
                    asteroids[i] = 0;
                    break;
                }else{
                    asteroids[i] = 0;
                    break;
                }
            }
            if(asteroids[i] != 0){
                st.push(asteroids[i]);
            }
        }
        int [] results = new int[st.size()];

        for(int i=results.length-1; i>=0; i--){
            results[i] = st.pop();
        }
        return results;
    }
}