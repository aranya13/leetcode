class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        cs(res , k  , n , new ArrayList<>() , 1);
        return res;
    }
    public void cs(List<List<Integer>> res , int k , int n , List<Integer> temp , int start){
        if(n == 0 && temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = start ; i <= 9 ; i++){
            if(n - i < 0) break;
            temp.add(i);
            cs(res , k , n - i , temp, i + 1 );
            temp.remove(temp.size() - 1);
        }
    }
}