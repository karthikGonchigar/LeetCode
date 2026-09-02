class Solution {
public String minWindow(String s, String t) {

    if (t.length() > s.length())
        return "";

    int left = 0;
    int right = 0;

    String min = "";

    int[] s1 = new int[256];
    int[] t1 = new int[256];

    // Frequency of t
    for (char ch : t.toCharArray()) {
        t1[ch]++;
    }

    while (right < s.length()) {

        // Expand window
        s1[s.charAt(right)]++;
        right++;

        // Shrink while window is valid
        while (contain(s1, t1)) {

            if (min.equals("") || right - left < min.length()) {
                min = s.substring(left, right);
            }

            // Remove left character
            s1[s.charAt(left)]--;
            left++;
        }
    }

    return min;
}

static boolean contain(int[] s1, int[] t1) {

    for (int i = 0; i < 256; i++) {

        if (s1[i] < t1[i])
            return false;
    }

    return true;
}

}
