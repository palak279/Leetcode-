class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(map.get(nums[i]) > n /3 && !result.contains(nums[i])){
                result.add(nums[i]);
            }
        }
        return result;
    }
}