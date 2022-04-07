//https://www.youtube.com/watch?v=MCyCVunb_e0
public class MedianOfTwoSortedArrays
{
     public double findMedianSortedArrays(int [] nums1, int [] nums2)
     {
         int p1 = 0, p2 = 0, m = nums1.length, n = nums2.length;
         int t = m + n;
         int l = (t + 1) / 2;
         int r = (t + 2) / 2;
         return (getKth(nums1, 0, nums2, 0, l) + getKth(nums1, 0, nums2, 0, r)) / 2.0;
    //     int [] merged = new int [m + n];
    //     int pos = 0;
    //     while(p1 < m || p2 < n)
    //     {
    //         if(p1 < m && p2 < n)
    //         {
    //             if(nums1[p1] < nums2[p2])
    //             {
    //                 merged[pos++] = nums1[p1++];
    //             }
    //             else
    //             {
    //                 merged[pos++] = nums2[p2++];
    //             }}
    //             else if(p1 < m && p2 >= n)
    //             {
    //                 merged[pos++] = nums1[p1++];
    //             }
    //             else
    //             {
    //                 merged[pos++] = nums2[p1++];
    //             }
    //         }
    //         int t = m + n;
    //         if( t % 2 == 0)
    //         {
    //             return (merged[t/2] + merged [t / 2-1]) / 2.0;
    //         }

    //         return (double)merged[t / 2];
     }
    public double getKth(int[] A, int aStart, int[] B, int bStart, int k)
    {
        if(aStart > A.length - 1) return B[bStart + k - 1];
        if(bStart > B.length - 1) return A[aStart + k - 1];
        if(k == 1) return Math.min(A[aStart], B[bStart]);
        int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
        if(aStart + k / 2 - 1 < A.length) aMid = A[aStart + k / 2 - 1];
        if(bStart + k / 2 - 1 < B.length) bMid = B[bStart + k / 2 - 1];
        if(aMid < bMid)
        {
            return getKth(A, aStart + k / 2, B, bStart, k - k /2);
        }
        else
        {
            return getKth(A, aStart, B, bStart + k / 2, k - k /2);
        }
    }
     
}
    

