class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        double b;
        for(int i = 0 ; i < nums1.length ; i++){
            a.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length ; i++){
            a.add(nums2[i]);
        }

        Collections.sort(a);
        int n = a.size();

        if(n % 2 == 0){
            int mid1 = a.get(n / 2 - 1);
            int mid2 = a.get(n / 2);
            b = (mid1 + mid2) / 2.0;
        }
        else{
            b = a.get(n/2);
        }
        return b;
    }
}