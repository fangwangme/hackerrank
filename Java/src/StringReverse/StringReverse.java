package StringReverse;

/**
 * Created by fang on 03/11/2016.
 *
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 *
 * @author  Fang Wang
 * @version 1.0
 */


import java.util.*;


public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int midNum = A.length() / 2;
        String beginPart;
        if (A.length() % 2 == 0) {
            beginPart = A.substring(0, midNum);
        } else {
            beginPart = A.substring(0, midNum + 1);
        }

        String endPart = A.substring(midNum);
        char[] endCharArray = endPart.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=endCharArray.length-1; i>=0; i--) {
            sb.append(endCharArray[i]);
        }

        if (beginPart.equals(sb.toString()))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}
