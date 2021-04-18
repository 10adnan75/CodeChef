#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--) {
	    int amin, bmin, cmin, a, b, c, t;
	    cin>>amin>>bmin>>cmin>>t>>a>>b>>c;
	    if (a>=amin && b>=bmin && c>=cmin && a+b+c>=t) cout<<"YES"<<endl;
	    else cout<<"NO"<<endl;
	}
	return 0;
}
