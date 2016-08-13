/*
@author: Fang Wang
@date: 2016.08.13
*/

#include <iostream>
#include <sstream>
using namespace std;

class Student{
private:
    int age;
    int standard;
    string first_name;
    string last_name;

public:
    void set_age(int i_age){
        age = i_age;
    }

    void set_standard(int i_standard){
        standard = i_standard;
    }

    void set_last_name(string i_last_name){
        last_name = i_last_name;
    }

    void set_first_name(string i_first_name){
        first_name = i_first_name;
    }

    string to_string(){
        ostringstream ss;
        ss << age << "," << first_name << "," << last_name << "," << standard;
        return ss.str();
    }

    int get_age(){
        return age;
    }

    int get_standard(){
        return standard;
    }

    string get_last_name(){
        return last_name;
    }

    string get_first_name(){
        return first_name;
    }
};

int main() {
    int age, standard;
    string first_name, last_name;

    cin >> age >> first_name >> last_name >> standard;

    Student st;
    st.set_age(age);
    st.set_standard(standard);
    st.set_first_name(first_name);
    st.set_last_name(last_name);

    cout << st.get_age() << "\n";
    cout << st.get_last_name() << ", " << st.get_first_name() << "\n";
    cout << st.get_standard() << "\n";
    cout << "\n";
    cout << st.to_string();

    return 0;
}
