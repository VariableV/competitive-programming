#include <iostream>
#include <vector>
#include <algorithm>

int main(){
    std::string str;
    while(true){
        if (std::cin >> str && str!="#"){
            int freq[129]={0};
            for(int i =0; i < str.length(); i++){
                freq[str[i]]++;
            }
            std::vector<char> vec;
            for(int i = 0; i <= 128; i++){
                if (freq[i]%2!=0){
                    vec.push_back((char)i);
                }
            }
            std::sort(vec.begin(), vec.end());
            std::string ret="";
            for(int i = 0; i <vec.size()-1; i++){
                ret += vec[i];
            }
            std::cout << ret << std::endl;
        }
        else{
            break;
        }
    }
}