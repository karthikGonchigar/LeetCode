class Solution {
    public String arrangeWords(String text) {
        String [] words = text.toLowerCase().split(" ");
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        text = String.join(" ", words);
        text = Character.toUpperCase(words[0].charAt(0))+text.substring(1);
        return text; 
    }
}
