#include <iostream>
using namespace std;
#define long long int

int main() {
	// your code goes here
	int a,b,c; cin>>a>>b>>c;
	if (a+b<c or b+c<a or a+c<b) cout<<"NO";
	else cout<<"YES";
	return 0;
}
