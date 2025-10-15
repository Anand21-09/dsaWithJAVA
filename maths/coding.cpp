#include <iostream>
using namespace std;
void sqroot(int number);
int main(){
    sqroot(36);
    return 0;
}
void sqroot(int number){
    double tolerance = 0.0001;
        double root;
        double X = number;
        while (true) {
            root = 0.5 * (X + (number / X));
            double ans = X - root;
            if (ans < tolerance) {
                break;
            }
            X = root;

        }
        cout<<root;
}