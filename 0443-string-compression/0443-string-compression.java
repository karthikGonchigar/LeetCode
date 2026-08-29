class Solution {
    public int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char current = chars[read];
            int count = 0;

            // Count consecutive characters
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // Write character
            chars[write++] = current;

            // Write count only if > 1
            if (count > 1) {
                String num = String.valueOf(count);

                for (char ch : num.toCharArray()) {
                    chars[write++] = ch;
                }
            }
        }

        return write;
    }
}