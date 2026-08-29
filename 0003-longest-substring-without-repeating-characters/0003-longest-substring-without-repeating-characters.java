class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        String max = "";
        for(char ch : s.toCharArray()){
            int index = sb.indexOf(String.valueOf(ch));
            if(index !=-1){
                sb.delete(0, index+1);
                sb.append(ch);
            }
            else    sb.append(ch);
            if(sb.length() > max.length())  max = sb.toString();
        }
        return max.length();
    }
}