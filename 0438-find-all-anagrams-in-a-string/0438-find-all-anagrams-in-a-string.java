class Solution {
    public List<Integer> findAnagrams(String s, String p) {

       List<Integer> list = new ArrayList<>();
       if(s.length() < p.length())  return list;
       int k = p.length();

        int [] s1 = new int [26];
        int [] p1 = new int [26];

        for(int i=0; i<k; i++)
            p1[p.charAt(i) - 'a']++;
        
        for(int i=0; i<k; i++)
            s1[s.charAt(i)-'a']++;

        if(Arrays.equals(s1,p1))
            list.add(0);

        for(int i=0; i<s.length()-p.length(); i++){
            s1[s.charAt(i)-'a']--;
            s1[s.charAt(i+k)-'a']++;
            if(Arrays.equals(s1, p1))  
                list.add(i+1);
        }
        return list;

    }
}