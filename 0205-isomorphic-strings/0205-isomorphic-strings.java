// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if(s.length() != t.length())    return false;
//        HashMap<Character, Character> map = new HashMap<>();
//        HashMap<Character, Character> map1 = new HashMap<>();
//        for(int i=0; i<s.length(); i++){
//        if(map.containsKey(s.charAt(i))){
//             if(map.get(s.charAt(i)) != t.charAt(i)) return false;
//        }
//        else{
//         map.put(s.charAt(i), t.charAt(i));
//        } 
//     }
//     for(int i=0; i<t.length(); i++){
//        if(map1.containsKey(t.charAt(i))){
//             if(map1.get(t.charAt(i)) != s.charAt(i)) return false;
//        }
//        else{
//         map1.put(t.charAt(i), s.charAt(i));
//        } 
//     }
//     return true;
//     }
// }
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (sMap[a] != tMap[b])
                return false;

            sMap[a] = i + 1;
            tMap[b] = i + 1;
        }

        return true;
    }
}