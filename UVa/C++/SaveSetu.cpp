#include <iostream>

int main()
{
    int n, cn, total=0;
    std::string cmd;
    std::cin >> n;
    while(n-- > 0)
    {
        std::cin >> cmd;
        if (cmd == "donate"){
            std::cin >> cn;
            total += cn;
        }
        else
            std::cout << total << std::endl;
    }
}