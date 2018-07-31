#include <iostream>
#include <algorithm>

int main()
{
    while(true)
    {
        std::string str;
        std::cin >> str;
        if (str == "#")
            break;
        char* charr = (char*)str.c_str();
        if (!std::next_permutation(charr, charr+str.length()))
            std::cout << "No Successor" << std::endl;
        else
            std::cout << charr << std::endl;
    }
}