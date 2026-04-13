/**
 * Name: Matthew Briones
 * Date: April 13, 2026
 * Explanation: This class contains recursive solutions for five logic problems:
 * counting specific digits, counting substrings with specific rules, and cleaning strings.
 * All solutions avoid the use of loops like for and while and instead uses if
 */

public class RecursionProblems {

    /**
     * Counts occurrences of digit 8. 
     * If an 8 has another 8 to its left, it counts double.
     */
    public static int count8(int n) {
        if (n == 0) return 0;
        
        // Check rightmost digit
        if (n % 10 == 8) {
            // Check if digit to the left is also 8
            if ((n / 10) % 10 == 8) {
                return 2 + count8(n / 10);
            }
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    /**
     * Counts occurrences of "hi" in a string.
     */
    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    /**
     * Counts "hi", but ignores "hi" if preceded by 'x'.
     */
    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        
        // If it starts with 'x', check if 'hi' follows, then skip 'x' and 'hi'
        if (str.charAt(0) == 'x') {
            if (str.length() >= 3 && str.substring(1, 3).equals("hi")) {
                return countHi2(str.substring(3));
            }
            return countHi2(str.substring(1));
        }
        
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        
        return countHi2(str.substring(1));
    }

    /**
     * Counts non-overlapping occurrences of a substring 'sub'.
     */
    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    /**
     * Reduces adjacent identical characters to a single character.
     */
    public static String stringClean(String str) {
        if (str.length() < 2) return str;
        
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }
}