#include <iostream>
using namespace std;

int main() {
	// your code goes here
	long long t;
	cin>>t;
	while(t--) {
	    long long n,a,b,n1=0,n2=0;
	    cin>>n>>a>>b;
	    while(n--) {
	        string s;
	        cin>>s;
	        if (s[0]=='E'||s[0]=='Q'||s[0]=='U'||s[0]=='I'||s[0]=='N'||s[0]=='O'||s[0]=='X') n1 += a;
	        else n2 += b;
	    }
	    if (n1 > n2) cout<<"SARTHAK"<<endl;
	    else if (n1 == n2) cout<<"DRAW"<<endl;
	    else cout<<"ANURADHA"<<endl;
	}
	return 0;
}
