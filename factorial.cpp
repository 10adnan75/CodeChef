#include <iostream>
using namespace std;

int main() {
	// your code goes here
	long long t;
	cin>>t;
	while(t--) {
	    long long n;
	    cin>>n;
	    int fact = 0;
	    while (n > 0) {
	        n = n / 5;
	        fact += n;
	    }
	    cout<<fact<<endl;
	}
	return 0;
}
