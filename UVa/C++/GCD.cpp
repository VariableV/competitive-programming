#include <iostream>

int gcd(int a, int b){
	return b==0 ? a : gcd(b, a%b);
}

int main(){
	int d;
	while(true){
		std::cin >> d;
		if(d==0)break;
		int sum=0;
		for(int i = 1; i < d; i++){
			for(int j = i+1; j <= d; j++){
				sum += gcd(i,j);
			}
		}
		std::cout << sum << std::endl;
	}
}