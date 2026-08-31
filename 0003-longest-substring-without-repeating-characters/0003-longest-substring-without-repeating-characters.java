class Solution {
    public int lengthOfLongestSubstring(String s) {
        int k = 0;
        String max = "";
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int pos = sb.indexOf(String.valueOf(ch));
            if(pos != -1){
                sb.delete(0, pos+1);
                sb.append(ch);
            }else{
                sb.append(ch);
            }
            if(sb.length() > max.length())  max = sb.toString();
        }
        return max.length();
    }
}

