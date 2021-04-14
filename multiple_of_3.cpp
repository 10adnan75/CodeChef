#include <iostream>
typedef long long ll;
using namespace std;

int main() {
	// your code goes here
	int a[] = {2, 4, 8, 6}; 
	ll t;
	cin>>t;
	while(t--) {
	    ll k, d0, d1, sum, div, total = 0;
	    cin>>k>>d0>>d1;
	    sum = d0+d1;
	    div = (k-3)/4;
	    for (int i=0; i<4; i++) {
	        total += div*((a[i]*sum)%10);
	    }
	    div = (k-3)%4;
	    for (int i=0; i<div; i++) {
	        total += (a[i]*sum)%10;
	    }
	    total += (sum + sum%10);
	    if (total % 3 == 0) cout<<"YES"<<endl;
	    else cout<<"NO"<<endl;
	}
	return 0;
}
