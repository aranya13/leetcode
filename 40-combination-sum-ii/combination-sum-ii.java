class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0 , new ArrayList<>() , 0 , candidates , target , res);
        return res;
    }
    public void dfs(int i , List<Integer> cur , int total , int[] candidates , int target , List<List<Integer>> res){
        if(total == target){
            res.add(new ArrayList<>(cur));
            return;
        }
        if(i >= candidates.length || total > target){
            return;
        }
        cur.add(candidates[i]);
        dfs(i + 1, cur , total + candidates[i] , candidates , target , res);
        cur.remove(cur.size() - 1);

        while(i + 1 < candidates.length && candidates[i] == candidates[i + 1]){
            i++;
        }
        dfs(i + 1, cur , total , candidates , target , res);
    }
}