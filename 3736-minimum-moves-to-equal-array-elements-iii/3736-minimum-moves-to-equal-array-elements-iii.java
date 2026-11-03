class Solution {
    public int minMoves(int[] nums) {
        int moves = 0, max = 0;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != max){
                moves = moves + (max - nums[i]);
            }
        }
        return moves;
    }
}