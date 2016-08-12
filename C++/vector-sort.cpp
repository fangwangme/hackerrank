/*
Input:
The first line of the input contains N where  is the number of integers. The next line contains N integers.

OutPut:
Print the integers in the sorted order one by one in a single line followed by a space.
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int num_count;
    cin >> num_count;

    int each_num;
    vector<int> vc;

    while ( cin >> each_num){
        vc.push_back(each_num);
    }

    sort(vc.begin(), vc.end());
    for (int i=0; i<vc.size()-1; i++){
        cerr << vc[i] << " ";
    }
    cerr << vc[vc.size() -1];

    return 0;
}
