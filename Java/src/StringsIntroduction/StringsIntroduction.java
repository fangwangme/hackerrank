package StringsIntroduction;

/**
 * Created by fang on 03/11/2016.
 * <p>
 * The elements of a String are called characters. The number of characters in a String is called the length,
 * and it can be retrieved with the String.length() method.
 * <p>
 * Given two strings of lowercase English letters, A and B, perform the following operations:
 * <p>
 * Sum the lengths of A and B.
 * Determine if A is lexicographically larger than B(i.e.: does B come before A in the dictionary?).
 * Capitalize the first letter in  and  and print them on a single line, separated by a space.
 * <p>
 * Input Format
 * <p>
 * The first line contains a string A. The second line contains another string B.
 * The strings are comprised of only lowercase English letters.
 * <p>
 * Output Format
 * <p>
 * There are three lines of output:
 * For the first line, sum the lengths of A and B.
 * For the second line, write Yes if A is lexicographically larger than B or No if it is not.
 * For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
 *
 * @author Fang Wang
 * @version 1.0
 */

import java.util.*;


public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // print sum of to string length
        System.out.println(A.length() + B.length());

        // compare two string
        int aStart = (int) A.charAt(0);
        int bStart = (int) B.charAt(0);
        if (aStart <= bStart)
            System.out.println("No");
        else
            System.out.println("Yes");

        // print title format combined string
        StringBuilder sb = new StringBuilder();
        String combinedString = A + " " + B;
        boolean titleFlag = true;
        for (char c : combinedString.toCharArray()) {
            if (titleFlag) {
                c = Character.toUpperCase(c);
            }

            if (Character.isWhitespace(c)) {
                titleFlag = true;
            } else {
                titleFlag = false;
            }

            sb.append(c);
        }
        System.out.println(sb.toString());

    }
}
