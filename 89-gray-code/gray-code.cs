public class Solution {
    public IList<int> GrayCode(int n) {
        IList<int> res = new List<int>();
        for(int i = 0 ; i < (1 << n); i++){
            res.Add(i ^ (i >> 1));
        }
        
        return res;
    }
}