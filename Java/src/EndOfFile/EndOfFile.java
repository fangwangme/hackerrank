package EndOfFile;

/**
 * Created by fang on 01/11/2016.
 * The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
 * Hint: Java's Scanner.hasNext() method is helpful for this problem.
 *
 * Input Format
 * Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
 *
 * Output Format
 * For each line, print the line number, followed by a single space, and then the line content received as input.
 *
 */

import java.util.Scanner;


public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idx = 0;
        while (scan.hasNext()) {
            idx ++;
            System.out.printf("%d ", idx);
            String next = scan.nextLine();
            System.out.println(next);
        }

        scan.close();
    }
}
