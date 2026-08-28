class Solution {
    public String reverseWords(String s) {
        String [] words = s.trim().split("\\s+");
        String reverse = "";
        for(int i = words.length-1; i>=0; i--)  reverse+=words[i]+" ";
        reverse = reverse.trim();
        return reverse;
    }
}