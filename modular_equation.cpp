#include <bits/stdc++.h>
#include <iostream>
using namespace std;
typedef long long ll;

int main() {
	// your code goes here
	ll t; cin>>t;
	while(t--) {
	    ll N,M; cin>>N>>M;
	    ll result=0;
	    vector<ll> modulo(N+1,1);
	    for (ll i=2; i<=N; i++) {
	        ll a=M%i;
	        result+=modulo[a];
	        for (ll j=a; j<=N; j+=i) modulo[j]++;
	    }
	    cout<<result<<"\n";
	    
	    /* ll count=N-1;
	    for (ll a=2; a<N; a++) {
	        ll res=M%a;
	        ll b=N;
	        while(b-- > a) {
	            if (res%b == res) count++;
	        }
	    }
	    cout<<count<<"\n"; */
	}
	return 0;
}
