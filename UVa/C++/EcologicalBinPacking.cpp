#include <iostream>
#include <algorithm>

int main(){
	int b1,g1,c1,b2,g2,c2,b3,g3,c3;
	while(scanf("%d %d %d %d %d %d %d %d %d", &b1,&g1,&c1,&b2,&g2,&c2,&b3,&g3,&c3)!=EOF){
		int arr[][3] = {{b1,g1,c1},{b2,g2,c2},{b3,g3,c3}};
		int min=2147483647;
		std::string perm="BCG";
		std::string minb=perm;
		do{
			int steps=0;
			int posb=perm.find('B'),posc=perm.find('C'),posg=perm.find('G');
			for(int col=0; col<3; col++){
				for(int row=0; row<3; row++){
					if ((col==0 && row==posb)||(col==2&&row==posc)||(col==1&&row==posg)) continue;
					steps+=arr[row][col];
				}
			}
			if (steps < min){
				minb=perm;
				min=steps;
			}
		}while(std::next_permutation(std::begin(perm),std::end(perm)));
		printf("%s %d\n", minb.c_str(), min);
	}
}