class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
        Arrays.sort(hand);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<hand.length; i++){
            if(map.containsKey(hand[i])){
                map.put(hand[i], map.get(hand[i]) + 1);
            }else{
                map.put(hand[i], 1);
            }

        }
        for(int i=0; i<hand.length; i++){
            if(map.get(hand[i]) == 0){
                continue;
            }
            int start = hand[i];

            for(int j=0; j<groupSize; j++){
                int current = start + j;

                if(!map.containsKey(current) || map.get(current) == 0){
                    return false;
                }
                map.put(current, map.get(current) - 1);
            }
        }
        return true;
    }
}