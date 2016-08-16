#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    int Q;
    cin >> Q;

    map<string, int> stus;
    string stu_name;
    int score;
    int type;
    for (int i=0; i<Q; i++){
        cin >> type;
        if (type == 1){
            cin >> stu_name >> score;
            if (stus.find(stu_name) == stus.end()){
                stus[stu_name] = score;
            } else{
                stus[stu_name] += score;
            }
        } else if (type == 2){
            cin >> stu_name;
            stus[stu_name] = 0;
        } else if (type == 3){
            cin >> stu_name;
            cout << stus[stu_name] << endl;
        }
    }
    return 0;
}
