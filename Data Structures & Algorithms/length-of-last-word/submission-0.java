class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String str="";
        int last = s.lastIndexOf(" ");
        int l=s.length();
        for(int i=last+1;i<l;i++)
        {
            str+=s.charAt(i);
        }
        int l1= str.length();
        return l1;
    }
}
