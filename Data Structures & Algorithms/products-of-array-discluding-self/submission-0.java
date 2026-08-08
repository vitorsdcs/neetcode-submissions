class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int pre = 1;
        int post = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                pre = pre * nums[i-1];
            }
            answer[i] = pre;
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (j < nums.length - 1) {
                post = post * nums[j+1];
            }
            answer[j] *= post;
        }
        return answer;
    }
}
