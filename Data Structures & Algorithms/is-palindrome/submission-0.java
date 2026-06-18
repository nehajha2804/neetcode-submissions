class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char arr[] = clean.toCharArray();
        int n = arr.length;
        for(int i = 0; i < n / 2; i++){
            if(arr[i] != arr[n - 1 - i]){
                return false;
            }
        }

        return true;
    }
}