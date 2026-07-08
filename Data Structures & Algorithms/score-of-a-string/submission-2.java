class Solution {
    public int scoreOfString(String s) {
        int score=0;
        int sum=0;
        int k=0;
        while(k<s.length()-1){
            score=s.charAt(k+1)-s.charAt(k);
            if(score<0) score*=-1;
            sum+=score;
            k++;
        }
    return sum;    
    }
}