#include <iostream>
using namespace std;
typedef long long ll;

int main() {
	ll t; cin>>t;
	while(t--) {
	    ll xcount=0, ocount=0, _count=0, xwin=0, owin=0;
	    char ttc[3][3];
	    
	    for(ll i=0; i<3; i++) 
	        for(ll j=0; j<3; j++) {
	            cin>>ttc[i][j];
	            if(ttc[i][j] == 'X') xcount++;
	            if(ttc[i][j] == 'O') ocount++;
	            if(ttc[i][j] == '_') _count++;
	        }
	        
	    for(ll i=0; i<3; i++) {
	        if(ttc[0][i]==ttc[1][i] && ttc[2][i]==ttc[1][i]) {
	            if(ttc[0][i] == 'X') xwin++;
	            if(ttc[0][i] == 'O') owin++;
	        }
	        
	        if(ttc[i][0]==ttc[i][1] && ttc[i][2]==ttc[i][1]) {
	            if(ttc[i][0] == 'X') xwin++;
	            if(ttc[i][0] == 'O') owin++;
	        }
	    }
	    
	    if((ttc[0][0]==ttc[1][1] && ttc[2][2]==ttc[1][1]) || (ttc[2][0]==ttc[1][1] && ttc[0][2]==ttc[1][1])) {
	        if(ttc[1][1] == 'X') xwin++;
	        if(ttc[1][1] == 'O') owin++;
	    }
	    
	    if(ocount > xcount || xcount - ocount > 1) cout<<3<<"\n";
	    else if(_count>0 && xwin+owin==0) cout<<2<<"\n";
	    else if((xcount>ocount && xwin==1 && owin==0) || (xcount==ocount && owin==1 && xwin==0) || (_count==0 && xwin+owin==0) || (_count==0 && xwin==2)) cout<<1<<"\n"; 
	    else cout<<3<<"\n";
	    //cout<<xcount<<" "<<ocount<<endl;
	}
	return 0;
}
