class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int k = arr.length - 1; k >= 0; k--) {
            int temp = arr[k];
            arr[k] = max;
            if (temp > max) max = temp;
        }
        return arr;
    }
}