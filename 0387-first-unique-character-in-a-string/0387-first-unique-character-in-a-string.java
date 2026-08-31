class Solution {
    public int firstUniqChar(String s) {
        int index = 0;
        int [] fre = new int [26];
        for(char ch : s.toCharArray()){
            fre[ch-'a']++;
        }
        for(char ch : s.toCharArray()){
            if(fre[ch-'a'] == 1)
                return index;
            else
                index++;
        }
        return -1;
    } 
}