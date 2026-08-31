class Solution {
    public String arrangeWords(String text) {
        String [] words = text.toLowerCase().split(" ");
        text = "";
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for(int i = 0; i < words.length; i++)
            text += words[i]+" ";
        text = text.trim();
        text = Character.toUpperCase(words[0].charAt(0))+text.substring(1);
        return text; 
    }
}
