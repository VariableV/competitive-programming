#include <iostream>
#include <string.h>

int main(){
	std::string s,s2;
	while(std::getline(std::cin, s)){
		std::getline(std::cin, s2);
		int mat[s.length()+1][s2.length()+1]={};
		for(int r=1; r<=s.length(); r++){
			for(int c=1; c<=s2.length(); c++){
				if (s[r-1]==s2[c-1]){
					mat[r][c]=mat[r-1][c-1]+1;
				}
				else{
					mat[r][c]=mat[r-1][c]>mat[r][c-1]?mat[r-1][c]:mat[r][c-1];
				}
			}
		}
		std::cout << mat[s.length()][s2.length()] << std::endl;
	}
}