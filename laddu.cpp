#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--) {
	    int laddus = 0;
	    int activities; string origin;
	    cin>>activities>>origin;
	    
	    while(activities--) {
	        string s;
	        cin>>s;
	        if(s=="CONTEST_WON") {
	            int rank;
	            cin>>rank;
	            if (rank > 20) laddus += 300;
	            else laddus += 300 + 20 - rank;
	        }
	        else if(s=="TOP_CONTRIBUTOR") {
	            laddus += 300;
	        }
	        else if(s=="BUG_FOUND") {
	            int severity;
	            cin>>severity;
	            laddus += severity;
	        }
	        else if(s=="CONTEST_HOSTED") {
	            laddus += 50;
	        }
	    }
	    if (origin == "NON_INDIAN") cout<<laddus/400<<endl;
	    else cout<<laddus/200<<endl;
	}
	return 0;
}
