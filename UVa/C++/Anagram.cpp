#include <iostream>
#include <algorithm>
bool comparator(char a, char b){
  bool upperA=true, upperB=true;
  if (a >= 'a' && a <= 'z')
    upperA=false;
  if (b >= 'a' && b <= 'z') 
    upperB=false;
  if (upperA==upperB)
    return a<b;
  else{
    if (!upperA){
      a-=32;
      return a<b;
    }
    else{
      b-=32;
      return a<=b;
    }
  }
}
int main(){
	int n;
	std::cin >> n;
	while(n--){
		std::string str;
		std::cin >> str;
		std::sort(std::begin(str), std::end(str), comparator);
		std::cout << str << std::endl;
		while(std::next_permutation(std::begin(str), std::end(str), comparator)){
			std::cout << str << std::endl;
		}
	}
	getchar();
}