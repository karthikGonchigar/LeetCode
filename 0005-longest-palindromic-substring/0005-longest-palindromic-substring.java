class Solution {
    public String longestPalindrome(String s) {
        String max = "";
        for(int i = 0; i<s.length(); i++){
            String odd = palindrome(i, i, s);
            String even = palindrome(i, i+1, s);
            if(odd.length() > max.length())     max = odd;
            if(even.length() > max.length())    max = even;
        }
        return max;
    }
    public static String palindrome(int left, int right, String s){
        while( left >= 0 && right < s.length()){
            if(s.charAt(left) == s.charAt(right)){
                left --; right++;
            }
            else{
                return s.substring(left+1, right);
            }
        }
        return s.substring(left+1, right);
    }
}