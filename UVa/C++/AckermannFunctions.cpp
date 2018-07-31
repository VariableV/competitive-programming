#include <iostream>

int main(){
	while(true){
		long a,b;
		std::cin >> a >> b;
		if (a==0&&b==0) break;
		if (a > b){
			long tmp=b;
			b=a;
			a=tmp;
		}
		int maxn=0;
		long max=0;
		for(long i = a; i <= b; i++){
			int ack=0;
			long n=i;
			while(true){
				ack++;
				if (n%2==0){
					n/=2;
				}
				else{
					n = 3*n+1;
				}
				if (n==1) break;
			}
			if (ack > max){
				max=ack; maxn=i;
			}
		}
		printf("Between %ld and %ld, %ld generates the longest sequence of %d values.\n", a,b,max,maxn);
	}
}