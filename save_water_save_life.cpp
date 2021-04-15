#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--) {
	    int H, x, y, C;
	    cin>>H>>x>>y>>C;
	    if ((H * (x + (y / 2))) <= C) cout<<"YES"<<endl;
	    else cout<<"NO"<<endl;
	}
	return 0;
}
