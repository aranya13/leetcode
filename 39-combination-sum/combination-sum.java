class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(0 , new ArrayList<>() , 0 , candidates , target , res);
        return res; 
    }
    public void dfs(int i , List<Integer> cur , int total , int[] candidates , int target , List<List<Integer>> res){
        if(target == total){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(i >= candidates.length || total > target){
            return;
        }
        cur.add(candidates[i]);
        dfs(i , cur , total + candidates[i] , candidates , target , res);
        cur.remove(cur.size() - 1);
        dfs(i + 1 , cur , total , candidates , target , res);
    }
}