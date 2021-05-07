#include <iostream>
using namespace std;

string solve(int N,int x,int k) {
    if (x%k == 0) return "YES";
    if ((N+1-x)%k == 0) return "YES";
    return "NO";
}

int main() {
	int t;
	cin>>t;
	while(t--) {
	    int N,x,k;
	    cin>>N>>x>>k;
	    cout<<solve(N,x,k)<<"\n";
	}
	return 0;
}
