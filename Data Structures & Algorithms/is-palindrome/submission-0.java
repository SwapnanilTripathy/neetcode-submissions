class Solution {
    public static boolean isPal(int i, String s) {
        int n = s.length();
        if (i >= n / 2) return true;
        if (s.charAt(i) != s.charAt(n - i - 1)) return false;
        return isPal(i + 1, s);
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return isPal(0, s);
    }
}