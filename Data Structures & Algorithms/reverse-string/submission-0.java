class Solution {
    public void reverseString(char[] s) {
        int n= s.length;
        int j=n-1;
        for(int i=0;i<n/2;i++){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j--;
        }
        System.out.println(Arrays.toString(s));     
    }
}