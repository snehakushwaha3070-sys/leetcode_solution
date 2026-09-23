class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k > n

        int[] temp = new int[k];

        // store LAST k elements
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // shift the first (n-k) elements to the right by k
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // place stored elements at the front
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}