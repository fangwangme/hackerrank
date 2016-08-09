/*
@author: Fang Wang
@date:2016.08.09
@desc:
You are given a positive integer:
If  1 <= N <= 9, then print the English representation of it. That is "one" for 1, "two" for 2, and so on.
Otherwise print "Greater than 9" (without quotes).
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int N;
    cin >> N;
    if (N == 1){
        cout << "one" << endl;
    }
    else if (N == 2){
        cout << "two" << endl;
    }
    else if (N == 3){
        cout << "three" << endl;
    }
    else if (N == 4){
        cout << "four" << endl;
    }
    else if (N == 5){
        cout << "five" << endl;
    }
    else if (N == 6){
        cout << "six" << endl;
    }
    else if (N == 7){
        cout << "seven" << endl;
    }
    else if (N == 8){
        cout << "eight" << endl;
    }
    else if (N == 9){
        cout << "nine" << endl;
    }
    else{
        cout << "Greater than 9" << endl;
    }

   return 0;
}
