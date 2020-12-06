class Solution01 {
    //删除排序数组中的重复项（Facebook、字节跳动、微软在半年内面试中考过）
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0 )return 0;
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++) {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}