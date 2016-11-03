package SubString;

/**
 * Created by fang on 03/11/2016.
 * solution for hackerrank question : https://www.hackerrank.com/challenges/java-substring
 *
 * @author Fang Wang
 * @version 1.0
 */

import java.util.*;


public class SubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }
}
