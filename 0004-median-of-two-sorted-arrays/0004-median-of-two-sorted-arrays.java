class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n= nums2.length;
       int m= nums1.length;
       int[] arr = new int[n+m];
       for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }
        Arrays.sort(arr);
        if ((m+n) % 2 == 1) {
            return arr[(m+n) / 2];
        } else {
            return (arr[(m+n) / 2 - 1] + arr[(m+n)/ 2]) / 2.0;
        }
    }
}