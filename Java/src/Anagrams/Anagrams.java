package Anagrams;

/**
 * Created by fang on 03/11/2016.
 *
 * Two strings  and  are called anagrams if they consist same characters, but may be in different orders.
 * So the list of anagrams of  CAT is CAT. TCA ...
 *
 * Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not.
 * The strings may consist at most  English characters; the comparison should NOT be case sensitive.
 * This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.
 *
 * @author Fang Wang
 * @version 1.0
 */


import java.util.*;


public class Anagrams {

    static boolean isAnagram(String a, String b) {
        boolean anagramFlag;

        if (sortString(a).equalsIgnoreCase(sortString(b)))
            anagramFlag = true;
        else
            anagramFlag = false;

        return anagramFlag;
    }


    static String sortString(String a) {

        String sortedString;
        a = a.toLowerCase();
        char[] charArray = a.toCharArray();
        Arrays.sort(charArray);

        StringBuilder sb = new StringBuilder();
        for (char c : charArray)
            sb.append(c);

        sortedString = sb.toString();

        return sortedString;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
