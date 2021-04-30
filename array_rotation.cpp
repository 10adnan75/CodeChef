#include <iostream>
using namespace std;
#define modulo 1000000007
typedef long long ll;

int main() {
	// your code goes here
	ll n, total=0L;
	cin>>n;
	while (n--) {
	    ll x;
	    cin>>x;
	    total = (total+x+modulo);
	    total %= modulo;
	}
	ll q;
	cin>>q;
	while (q--) {
	    total = (2*total)%modulo;
	    cout<<total<<endl;
	}
	return 0;
}
