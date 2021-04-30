#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while (t--) {
	    int m,s;
	    cin>>m>>s;
	    int count=0;
	    while (m>=s){
	        count++;
	        m-=s;
	    }
	    cout<<count<<endl;
	}
	return 0;
}
