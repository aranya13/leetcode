class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        sub(res , nums , new ArrayList<>() , 0);
        return res;
    }
    public void sub(List<List<Integer>> res , int[] nums, List<Integer> temp , int start){
        res.add(new ArrayList<>(temp));
        for(int i = start ; i < nums.length ; i++){
            temp.add(nums[i]);
            sub(res , nums , temp , i + 1);
            temp.remove(temp.size() -  1);
        }
        
    }
}