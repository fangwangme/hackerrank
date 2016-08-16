/*
@author: Fang Wang
@date: 2016.08.17
@desc
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
using namespace std;

class Student{
public:
    int total_score;
    vector<int> score_list;

    void input(){
        //char each_score[2];
        int each_score;
        for (int i=0; i<5; i++){
            cin >> each_score;
            score_list.push_back(each_score);
        }
    }

    int calculateTotalScore(){
        total_score = 0;
        for (int i=0; i<score_list.size(); i++){
            total_score += score_list[i];
        }
        return total_score;
    }
};

int main() {
    int n; // number of students
    cin >> n;
    Student *s = new Student[n]; // an array of n students

    for(int i = 0; i < n; i++){
        s[i].input();
    }

    // calculate kristen's score
    int kristen_score = s[0].calculateTotalScore();
    cerr << kristen_score << endl;

    // determine how many students scored higher than kristen
    int count = 0;
    for(int i = 1; i < n; i++){
        int total = s[i].calculateTotalScore();
        cerr << "total :: " << total << endl;
        if(total > kristen_score){
            count++;
        }
    }
    // print result
    cout << count;

    return 0;
}
