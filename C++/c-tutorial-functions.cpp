/*
You have to write a function int max_of_four(int a, int b, int c, int d) which reads four arguments and returns the greatest of them.
Print the greatest of the four integers.
PS: I/O will be automatically handled.
*/

#include <iostream>
#include <cstdio>
using namespace std;

/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/

int max_of_four(int a, int b, int c, int d){
    int max = -2147483648;

    if (a > max)
        max = a;
    if (b > max)
        max = b;
    if (c > max)
        max = c;
    if (d > max)
        max = d;

    return max;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);

    return 0;
}
