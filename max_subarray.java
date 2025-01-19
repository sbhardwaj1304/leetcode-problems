 
    
class Solution {
    public int maxSubArray(int[] nums) {
        int maxiSum= Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
            if(curSum>maxiSum){
                maxiSum= curSum;
            }
            if(curSum<0){
                curSum=0;
            }

        }
        return maxiSum;
    }
}
