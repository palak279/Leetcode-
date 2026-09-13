class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int max = 0;
        int n = cardPoints.length;

        for(int i=0; i<k; i++){
            sum += cardPoints[i];
        }
        max = sum;

        for(int i=0; i<k; i++){
            sum -= cardPoints[k - 1 - i];
            sum += cardPoints[n - 1 - i];

            max = Math.max(sum, max);
        }
        return max;
    }
}