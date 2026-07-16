class Solution {
    public int countSeniors(String[] details) {
        int ct=0;
        for(int i=0;i<details.length;i++){
            String ageStr = details[i].substring(11, 13);
            int age = Integer.parseInt(ageStr);
            if (age > 60) {
                ct++;
            }
        }
        return ct;
    }
}