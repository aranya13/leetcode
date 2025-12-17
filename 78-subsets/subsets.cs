public class Solution {
    public IList<IList<int>> Subsets(int[] nums) {
        IList<IList<int>> res = new List<IList<int>>();
        sub(res , nums , 0 , new List<int>());
        return res;
    }
    public void sub(IList<IList<int>> res , int[] nums , int start , IList<int> temp){
        res.Add(new List<int>(temp));
        for(int i = start ; i < nums.Length ; i++){
            temp.Add(nums[i]);
            sub(res , nums , i + 1 , temp);
            temp.RemoveAt(temp.Count - 1);
        }
    }
}