class Solution {
    public int romanToInt(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++){
            char ch1=s.charAt(i-1);
            char ch2=(i < s.length()) ? s.charAt(i) : ' ';
            if(ch1=='I'&& (ch2=='V'|| ch2=='X')) sum-=1;
            else if(ch1=='X'&& (ch2=='L'|| ch2=='C')) sum-=10;
            else if(ch1=='C'&& (ch2=='D'|| ch2=='M')) sum-=100;
            else if(ch1=='I') sum+=1;
            else if(ch1=='V') sum+=5;
            else if(ch1=='X') sum+=10;
            else if(ch1=='L') sum+=50;
            else if(ch1=='C') sum+=100;
            else if(ch1=='D') sum+=500;
            else if(ch1=='M') sum+=1000;
        }
    return sum;    
    }
}