#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	long long int t;
	cin>>t;
	while (t-- > 0) {
	    long long int n, m, k;
	    cin>>n>>m>>k;
	    double dp[n+1][m+1];
	    for (long long int i=0; i<=n; i++) 
	        for (long long int j=0; j<=m; j++) {
	            if (i==0 || j==0) dp[i][j] = 0;
	            else cin>>dp[i][j];
	        }
	   for (long long int i=0; i<=n; i++) {
	       double previous = 0;
	       for (long long int j=0; j<=m; j++) {
	           dp[i][j] += previous;
	           previous = dp[i][j];
	       }
	   }
	   for (long long int j=0; j<=m; j++) {
	       double previous = 0;
	       for (long long int i=0; i<=n; i++) {
	           dp[i][j] += previous;
	           previous = dp[i][j];
	       }
	   }
	   long long int z;
	   if (m < n) z = m;
	   else z = n;
	   long long int ans = 0;
	   for (long long int len=1; len<=z; len++)
	        for (long long int i=len; i<=n; i++) 
	            for (long long int j=len; j<=m; j++) {
	                if ((dp[i][j]+dp[i-len][j-len]-dp[i][j-len]-dp[i-len][j])/(len*len) >= k) ans++;
	            }
	  cout<<ans<<endl;
	}
	return 0;
}
