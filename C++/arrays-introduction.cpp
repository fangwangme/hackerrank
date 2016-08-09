/*
@author: Fang Wang
@date: 2016.08.09
@desc: reverse print array
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin >> n;

    vector<int> v;
    int x;
    while (cin >> x)
        v.push_back(x);

    for (int i=v.size() - 1; i>0; i--)
        cout << v[i] << " ";
    cout << v[0];

    return 0;
}
