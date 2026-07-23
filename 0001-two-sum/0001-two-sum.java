class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            boolean flag =false; // optimization
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    flag=true;
                    return new int[] {i,j};
                }
            }
            if(flag==true) break;
        }
                return new int[] {};
            }
}
