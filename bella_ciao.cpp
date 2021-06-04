#include <iostream>
using namespace std;
typedef long long ll;

int main() {
	// your code goes here
	ll t,d,D,P,Q; cin>>t;
	while (t--) {
	    cin>>D>>d>>P>>Q;
	    ll ans=P*D;
	    ll total=D/d;
	    ans += Q*(total*(total-1)/2)*d;
	    ans += Q*(total)*(D%d);
	    cout<<ans<<"\n";
	}
	return 0;
}
