/*
@author: Fang Wang
@date: 2016.08.12
@desc:

Sample Input
abcd
ef

Sample Output
4 2
abcdef
ebcd af
*/


#include <iostream>
#include <string>
using namespace std;

int main() {
    string a,b;
    cin >> a;
    cin >> b;

    cout << a.length() << " " << b.length() << endl;
    cout << a << b << endl;

    string na,nb;
    na = b[0];
    nb = a[0];

    for (int i = 1; i < b.length(); i++){
        nb += b[i];
    }

    for (int j = 1; j < a.length(); j++){
        na += a[j];
    }

    cout << na << " " << nb << endl;
    return 0;
}
