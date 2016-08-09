/*
Input Format
Input consists of the following space-separated values: int, long, long long,
char, float, and double, respectively.

Output Format
Print each element on a new line in the same order it was received as input.
Note that the floating point value should be correct up to 3 decimal places and
the double to 9 decimal places.
*/

#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int a;
    long b;
    long long c;
    char d;
    float e;
    double f;
    cin >> a >> b >> c >> d >> e >> f;
    cout << f << endl;
    printf("%d\n%ld\n%lld\n%c\n%f\n%lf", a,b,c,d,e,f);
    return 0;
}
