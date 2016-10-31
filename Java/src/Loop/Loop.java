package Loop;

/**
 * Created by fang on 01/11/2016.
 *
 * Task
 * Given an integer, N, print its first 10 multiples. Each multiple N*i (where 1<= i<=10)
 * should be printed on a new line in the form: N x i = result.
 */

import java.util.Scanner;


public class Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i=1; i<= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, N*i);
        }
    }
}
