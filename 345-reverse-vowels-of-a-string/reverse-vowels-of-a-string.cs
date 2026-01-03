public class Solution {
    public string ReverseVowels(string s) {
        char[] arr = s.ToCharArray();
        int left = 0 ;
        int right = s.Length - 1;
        string vowels = "aeiouAEIOU";
        while(left < right){
            while(left < right && vowels.IndexOf(arr[left]) == -1){
                left++;
            }
            while(left < right && vowels.IndexOf(arr[right]) == -1){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        return new string(arr);
    }
}