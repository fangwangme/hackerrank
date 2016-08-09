/*
@author: Fang Wang
@date: 2016.08.09
@desc:
Input Format
Input will contain two integers, a and b, separated by a newline.

Output Format
You have to print the updated value of  and , on two different lines.
*/

#include <stdio.h>


void update(int *a,int *b) {
    int x = *a;
    int y = *b;
    *a = x + y;
    *b = abs(x - y);
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
