class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy = nums1.clone();
        int i=0,j=0,k=0;
        while(i < m && j< n && k<(m+n)) {
            if(copy[i] > nums2[j]) {
                nums1[k] = nums2[j];
                j++;
                k++;
            } else {
                nums1[k] = copy[i];
                i++;
                k++;
            }
        }
        
        while(m-i > 0) {
            nums1[k] = copy[i];
            k++;
            i++;
        }
        
        while(n-j> 0) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
        
    }
}
