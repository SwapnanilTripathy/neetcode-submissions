class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if (f.length == 1) {
            if (f[0] == 0) n--;
            return n <= 0;
        }
        int i = 0;
        while (i < f.length && n > 0) {
            if (i == 0) {
                if (f[i] == 0 && f[i + 1] == 0) {
                    f[i] = 1;
                    n--;
                    i += 2;
                    continue;
                }
            }
            else if (i == f.length - 1) {
                if (f[i] == 0 && f[i - 1] == 0) {
                    f[i] = 1;
                    n--;
                    i += 2;
                    continue;
                }
            }
            else if (f[i] == 0 && f[i - 1] == 0 && f[i + 1] == 0) {
                f[i] = 1;
                n--;
                i += 2;
                continue;
            }
            if (f[i] == 1)
                i += 2;
            else
                i++;
        }
        return n <= 0;
    }
}