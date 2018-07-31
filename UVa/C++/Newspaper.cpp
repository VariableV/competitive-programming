#include <iostream>
#include <map>

int main()
{
    int n;
    std::cin >> n;
    while(n-->0)
    {
        std::map<char, double> lookup;
        int c;
        std::cin >> c;
        while(c-->0)
        {
            char cc; int val;
            std::cin >> cc >> val;
            lookup.insert(std::pair<char,double>(cc,val/100.0));
        }

        std::cin >> c;
        double price = 0;
        std::string line;
        std::getline(std::cin, line);
        while(c-->0)
        {
            std::getline(std::cin, line);
            for(int i = 0; i < line.length(); i++)
            {
                char pchar = line.at(i);
                if (lookup.find(pchar) != std::end(lookup))
                    price += lookup.at(pchar);
            }
        }

        printf("%0.2f$\n", price);
    }
}