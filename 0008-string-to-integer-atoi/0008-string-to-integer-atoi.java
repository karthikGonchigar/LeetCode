class Solution {
public int myAtoi(String s) {

    s = s.trim();

    if (s.isEmpty())
        return 0;

    int sign = 1;
    int start = 0;

    if (s.charAt(0) == '-') {
        sign = -1;
        start = 1;
    }
    else if (s.charAt(0) == '+') {
        start = 1;
    }

    long num = 0;

    while (start < s.length()) {

        char ch = s.charAt(start);

        if (ch < '0' || ch > '9')
            break;

        num = num * 10 + (ch - '0');

        // Stop before long itself can overflow
        if (num > Integer.MAX_VALUE) {
            return sign == 1
                    ? Integer.MAX_VALUE
                    : Integer.MIN_VALUE;
        }

        start++;
    }

    return (int) (num * sign);
}

}
