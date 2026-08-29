class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int m = 0;
        int k = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++)
            if(strs[i].length() < k)
                k = strs[i].length();
        for(int i=0; i<k; i++){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                m++;
            }
            else{
                break;
            }
        }
        String n = "";
        for(int i=0; i<m; i++){
            n+=strs[0].charAt(i);
        }
        return n;
    }
}