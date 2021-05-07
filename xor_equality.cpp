#include <iostream>
#include <bits/stdc++.h>
#define ll long long
#define MOD 1000000007
using namespace std;

ll power(ll x, ll y, ll p) {
    ll res=1;
    x%=p;
    if(x==0) return x;
    while(y>0) {
        if(y&1) res = (res*x)%p;
        y/=2;
        x = (x*x)%p;
    }
    return res;
}

int main() {
	// your code goes here
	int t;
	cin>>t;
	while (t--) {
	    ll n;
	    cin>>n;
	    cout<<power(2, n-1, MOD)<<"\n";
	}
	return 0;
}
