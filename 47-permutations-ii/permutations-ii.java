class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        bt(res , new ArrayList<>() , nums , new boolean[nums.length]);
        return res;
    }
    public void bt(List<List<Integer>> res , List<Integer> temp , int[] nums , boolean[] used){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int i =  0 ; i < nums.length ; i++){
                if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i -1])){
                    continue;
                }
                used[i] = true;
                temp.add(nums[i]);
                bt(res , temp , nums , used);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}

