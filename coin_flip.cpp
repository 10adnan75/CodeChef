#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--) {
	    int g;
	    cin>>g;
	    while(g--) {
	        int i,n,q,k,h_count=0,t_count=0;
	        cin>>i>>n>>q;
	        if (n%2 == 0) {
	            cout<<n/2<<endl;
	            continue;
	        } else {
	            if (i==1) {
	                h_count = (n-1)/2;
	                t_count = n - h_count;
	            }
	            else {
	                t_count = (n-1)/2;
	                h_count = n - t_count;
	            }
	        }
	        if (q==1) cout<<h_count<<endl;
	        if (q==2) cout<<t_count<<endl;
	    }
	}
	return 0;
}
