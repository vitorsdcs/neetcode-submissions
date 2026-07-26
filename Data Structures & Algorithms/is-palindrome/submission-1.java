class Solution {
    public boolean isPalindrome(String s) {
        String alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int size = alphanumeric.length();
        char[] chars = alphanumeric.toCharArray();
        for (int i = 0; i < size; i++) {
            int oppositeIndex = size - 1 - i;
            if (i < oppositeIndex && chars[i] != chars[oppositeIndex]) {
                return false;
            }
        }
        return true;
    }
}
