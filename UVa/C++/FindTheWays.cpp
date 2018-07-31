#include <iostream>
#include <math.h>
double fac(int d){
	double result=std::log10(d);
	while(--d>0){
		result+=std::log10(d);
	}
	return result;
}
int main(){
	int n,k;
	while(scanf("%d %d", &n, &k)!=EOF){
		printf("%d\n",(int)(fac(n)-(fac(k) + fac(n-k)))+1);
	}
}