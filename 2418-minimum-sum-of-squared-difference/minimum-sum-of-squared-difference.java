class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int max = 0;

        for(int i = 0; i < nums1.length; i++){
            max = Math.max(max, Math.abs(nums1[i] - nums2[i]));
        }

        long[] freq = new long[max + 1];

        for(int i = 0; i < nums1.length; i++){
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
        }

        long k = (long) k1 + k2;

        for(int i = max; i > 0 && k > 0; i--){

            if(freq[i] == 0){
                continue;
            }

            if(k >= freq[i]){
                k -= freq[i];

                freq[i - 1] += freq[i];
                freq[i] = 0;
            }
            else{
                freq[i] -= k;
                freq[i - 1] += k;
                k = 0;
            }
        }

        long result = 0;

        for(int i = 1; i <= max; i++){
            result += freq[i] * (long)i * i;
        }

        return result;
    }
}