#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while (t--) {
	    long long i, n, count = 1;
	    cin>>n;
	    long long speeds[n], copy_speeds[n];
	    for(i=0; i<n; i++) cin>>speeds[i];
	    copy_speeds[0] = speeds[0];
        for (i=1; i<n; i++) {
            if (speeds[i] <= copy_speeds[i-1]) {
                copy_speeds[i] = speeds[i];
                count++;
            } else {
                copy_speeds[i] = copy_speeds[i-1];
            }
        }
        cout<<count<<endl;
    }
	return 0;
}
