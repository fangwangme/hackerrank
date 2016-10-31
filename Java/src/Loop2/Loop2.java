package Loop2;

/**
 * Created by fang on 01/11/2016.
 *
 * We use the integers a, b, and n to create the following series:
 *
 * You are given q queries in the form of a, b, and n. For each query,
 * print the series corresponding to the given a, b, and n values as a single
 * line of n space-separated integers.
 */

import java.util.Scanner;
import java.math.*;


public class Loop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j=0; j<n; j++) {
                int ans = a;
                for (int q=0; q<=j; q++) {
                    ans += Math.pow(2, q) * b;
                }
                System.out.printf("%d ", ans);
            }
            System.out.println();
        }
        in.close();
    }
}
