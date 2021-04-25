#include <iostream>
using namespace std;

int tetrahedral_number(int n) {
    return (n * (n + 1) * (n + 2)) / 6;
}

int main() {
	// your code goes here
	int n = 6;
	cout<<tetrahedral_number(n)<<endl;
	return 0;
}
