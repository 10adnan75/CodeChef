#include <iostream>
using namespace std;

int main() {
	// your code goes here
	long long t;
	cin>>t;
	while(t--) {
	    long long l, x[2] = {0};
	    string s;
	    bool flag = false;
	    cin>>l>>s;
	    for (long long i=0; i<l; i++) {
	        if (s[i]=='1') x[1]++;
	        else x[0]++;
	        
	        if (x[1] >= x[0]) {
	            flag = true;
	            break;
	        }
	    }
	    //cout<<x[0]<<" "<<x[1]<<endl;
	    if (flag) cout<<"YES"<<endl;
	    else cout<<"NO"<<endl;
	}
	return 0;
}
