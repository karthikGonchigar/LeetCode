class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();

        if(s.length() < p.length()) return list;

        int [] s1 = new int [26];
        int [] p1 = new int [26];

        for(char ch : p.toCharArray())
            p1[ch-'a']++;

        for(int i=0; i<p.length(); i++)
            s1[s.charAt(i)-'a']++;
        if(Arrays.equals(s1, p1))  list.add(0);

        for (int i = 0; i + p.length() < s.length(); i++){
            s1[s.charAt(i)-'a']--;
            s1[s.charAt(i+p.length())-'a']++;
            if(Arrays.equals(s1, p1))  list.add(i+1);
        }
        return list;
    }
}