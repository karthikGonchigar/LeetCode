class Solution {

    public String arrangeWords(String text) {

        String[] words = text.trim().toLowerCase().split("\\s+");
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        text = String.join(" ",words);
        text = Character.toUpperCase(text.charAt(0))+text.substring(1);
        return text;
    }
}