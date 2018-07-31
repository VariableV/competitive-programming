#include <iostream>
#include <cmath>
int main(){
	int d, c=1;
	while(true){
		std::cin >> d;
		if (0>d)break;
		printf("Case %d: %d\n", c++, (int)std::max(std::ceil(std::log2((double)d)), 0.0));
	}
}