class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i], 1);
        }
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i =0; i<list.size(); i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        if(list.size()==0){
            return -1;
        }else{
            return min;
        }
    }
}