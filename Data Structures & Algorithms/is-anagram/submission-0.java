class Solution {
    public boolean isAnagram(String s, String t) {
        int length = s.length();
        if (length != t.length() || length < 0) {
            return false;
        }

        char[] sAsChars = s.toCharArray();
        char[] tAsChars = t.toCharArray();

        Arrays.sort(sAsChars);
        Arrays.sort(tAsChars);

        for (int i = 0; i < length; i++) {
            if (sAsChars[i] != tAsChars[i]) {
                return false;
            }
        }
        return true;
    }
}
