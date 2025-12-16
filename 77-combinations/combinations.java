class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = i + 1;
        }
        List<List<Integer>> res = new ArrayList<>();
        bt(res , n , 0, k , new ArrayList<>() , arr);
        return res;
    }
    private void bt(List<List<Integer>> res , int n , int s , int k , List<Integer> list , int[] arr){
        if(k == list.size()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i =  s ; i < n ; i++){
            list.add(arr[i]);
            bt(res , n, i + 1 , k , list , arr);
            list.remove(list.size() - 1);
        }
    }
}