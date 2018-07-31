#include <iostream>
#include <algorithm>
#define maxn 2147483647
void runsieve(bool* arr){
	for(int i = 2; i <= maxn; i++){
		if (arr[i]){
			for(int j=2; j < maxn/i; j++){
				arr[i*j]=false;
			}
		}
	}
}
int main(){
	int L,U;
	bool arr[(unsigned int)maxn+1]; //bool* arr=(bool*)malloc(sizeof(bool)*(maxn+1));
	std::fill_n(arr, arr, maxn+1);
	runsieve(arr);
	arr[1]=false;
	while(scanf("%d %d\n", &L, &U) != EOF){
		int mindist[] = {maxn, -1, -1}, maxdist[] = {-maxn, -1, -1};
		for(int i = L; i < U; i++){
			int c=i+1, dist=1; 
			while(!arr[c] && c<U){
				dist++;
				c++;
			}
			if (mindist[0] > dist){
				mindist[0]=dist; mindist[1]=i; mindist[2]=c;
			}
			if (dist > maxdist[0]){
				maxdist[0]=dist; maxdist[1]=i; maxdist[2]=c;
			}
		}
		if (mindist[0]==maxn){
			printf("There are no adjacent primes.\n");
		}
		else{
			printf("%d,%d are closest, %d,%d are most distant.\n", mindist[1],mindist[2], maxdist[1], maxdist[2]);
		}
	}
}