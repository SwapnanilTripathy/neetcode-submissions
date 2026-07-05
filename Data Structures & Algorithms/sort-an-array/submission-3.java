class Solution {
    public int[] sortArray(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                if (i > 0) i--;
            } 
            else i++;
        }  
        return arr;  
    }
}