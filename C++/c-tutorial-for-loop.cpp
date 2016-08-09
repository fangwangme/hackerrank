/*
Input Format
You will be given two positive integers, A and B (A<=B), separated by a newline.

Output Format
For each integer  (so all numbers in that range):
If 1 <= N <= 9, then print the English representation of it. That is "one" for 1, "two" for 2, and so on.
Else if N > 9 and it is even, then print "even".
Else if N > 9 and it is odd, then print "odd".
Note:  represents the interval, i.e.,
*/

#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a, b;
    cin >> a;
    cin >> b;
    for (int i=a; i<=b; i++){
        if (i == 1){
            cout << "one" << endl;
        }
        else if (i == 2){
            cout << "two" << endl;
        }
        else if (i == 3){
            cout << "three" << endl;
        }
        else if (i == 4){
            cout << "four" << endl;
        }
        else if (i == 5){
            cout << "five" << endl;
        }
        else if (i == 6){
            cout << "six" << endl;
        }
        else if (i == 7){
            cout << "seven" << endl;
        }
        else if (i == 8){
            cout << "eight" << endl;
        }
        else if (i == 9){
            cout << "nine" << endl;
        }
        else{
            if (i % 2 == 0){
                cout << "even" << endl;
            }
            else{
                cout << "odd" << endl;
            }
        }

    }
    return 0;
}
