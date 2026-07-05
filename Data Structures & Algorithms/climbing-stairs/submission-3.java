class Solution {

    public long nCr(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || r == n) return 1;
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
        }
        return res;
    }
    public int climbStairs(int n) {
        int ans = 0;
        for (int two = 0; two <= n / 2; two++) {
            ans += nCr(n - two, two);
        }
        return ans;
    }
}