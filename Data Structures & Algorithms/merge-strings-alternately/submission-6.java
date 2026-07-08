class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            output = output + word1.charAt(i) + word2.charAt(i);
            i++;
        }
        while (i < word1.length()) {
            output = output + word1.charAt(i);
            i++;
        }
        while (i < word2.length()) {
            output = output + word2.charAt(i);
            i++;
        }
        return output;
    }
}