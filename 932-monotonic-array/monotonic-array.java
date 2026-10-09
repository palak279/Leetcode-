class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 1;

        while(i<nums.length && nums[i] == nums[i-1]){
            i++;
        }
        if(i == nums.length){
            return true;
        }
        if(nums[i] > nums[i-1]){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] < nums[j-1]){
                    return false;
                }
            }
        }
        else{
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] > nums[j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}