#include <iostream>

long long H(int n)
{
	long long res = 0;
	for( int i = 1; i <= n; i=i+1 )
		res = (res + n/i);
	return res;
}

int main()
{
	int n;
	std::cin >> n;
	while(n-- > 0)
	{
		int cuh;
		std::cin >> cuh;
		std::cout << H(cuh) << std::endl;
	}
}