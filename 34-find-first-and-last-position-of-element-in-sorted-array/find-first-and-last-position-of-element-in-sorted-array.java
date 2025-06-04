class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = first(nums , target);
        result[1] = last(nums , target);
        return result;
    }
    private int first(int[] nums , int target){
        int low = 0 ; 
        int high = nums.length - 1 ;
        int first = -1;

        while(low <= high){
            int mid = (high + low)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1 ;
            }
            else{
                high = mid - 1 ;

            }
        }
        return first;
    }
    private int last(int[] nums , int target){
        int low = 0 ; 
        int high = nums.length - 1 ;
        int last = -1;

        while(low <= high){
            int mid = (high + low)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                
                low = mid + 1;
            }
            else{
                high = mid - 1 ;
            }
        }
        return last;
    }
}