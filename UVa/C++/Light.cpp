#include <iostream>
#include <math.h>

int main()
{
  while(true)
  {
    int n;
    std::cin >> n;
    if (n==0) break;
    std::cout << ((std::pow((int)std::sqrt(n),2)==n) ? "yes" : "no") << std::endl;
  }
}