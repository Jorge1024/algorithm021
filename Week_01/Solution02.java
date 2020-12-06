class Solution02 {
    //旋转数组（微软、亚马逊、PayPal 在半年内面试中考过）
    public void rotate(int[] nums, int k) {
        int temp;
        int previous;
        for (int i = 0; i < k; i++ ){
            previous = nums[nums.length-1];
            for(int j =0; j < nums.length; j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;

            }
        }

    }
}