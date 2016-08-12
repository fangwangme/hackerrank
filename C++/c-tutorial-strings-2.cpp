#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
    ostringstream stream1(str);
    //cerr << stream1.str() << endl;
    int num;
    char ch;
    vector<int> vc;
    stream1 >> num >> ch;
    cerr << num << endl;
    cerr << ch << endl;
    //cerr << num << "|" << ch << endl;

    /*
    while (stream1 >> num >> ch) {
        i ++;
        cout << "num : " << num << " ch: "<< ch << endl;
        if (i > 100){
            break;
        }
    }
    */

    return vc;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }

    return 0;
}
