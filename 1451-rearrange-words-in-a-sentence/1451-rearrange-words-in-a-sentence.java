class Solution {
    public String arrangeWords(String text) {
        String [] words = text.trim().toLowerCase().split("\\s+");
        Arrays.sort(words, (a,b) -> a.length() - b.length());
        String reverse = String.join(" ", words);
        reverse = Character.toUpperCase(reverse.charAt(0))+reverse.substring(1);
        return reverse;
    }
}