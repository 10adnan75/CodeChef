#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n, k, count;
	cin>>n>>k;
	bool a[n] = {0};
	while (k--) {
	    count = 0;
	    string s;
	    int x;
	    cin>>s;
	    if (s == "CLOSEALL") {
	        count = 0;
	        for (int i=0; i<n; i++) a[i] = false;
	        cout<<"0\n";
	        continue;
	    }
	    cin>>x;
	    a[x-1] ^= 1;
	    for (int i=0; i<n; i++) {
	        if (a[i]) count++;
	    }
	    cout<<count<<"\n";
	} 
	return 0;
}
