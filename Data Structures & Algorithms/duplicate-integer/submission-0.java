class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> copy = new HashSet<>();
        for (int num : nums) {
            if (copy.contains(num)) {
                return true;
            }
            copy.add(num);
        }
        return false;
    }
}