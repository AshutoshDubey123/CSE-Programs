#include<bits/stdc++.h>//this header file will be used throughout CP, it has all libraries included within it

using namespace std; /*some functionalities which are used for taking i/p or giving o/p like cin or cout are present in a namespace from where they are taken,
you may specify that cin has come from std by writing std::cin 
or for cout std::cout etc., 
but these are time consuming, it is better to write "using namespace std" at once*/
int main()
{
    int a,b;
    cin>>a>> b;//this will create space separated inputs
    int sum = a+b;
    cout << sum << endl;
    return 0;

}
/*
std::endl and \n both seem to do the same thing but there is a  difference between them. 

std::cout << std::endl inserts a new line and flushes the stream(output buffer), whereas std::cout << “\n” just inserts a new line.

Therefore, std::cout << std::endl; can be said equivalent to std::cout << ‘\n’ << flush; 

Though in some use cases like competitive programming, it is better to use “\n” when the problem is not interactive, 
as it saves time by not flushing the entire line and thus improves the time complexity of the program.

difference between endl and \n

endl is a manipulator. 	\n is a character.
endl doesn’t occupy any memory. 	\n occupies 1 byte memory as it is a character.
endl is a keyword and would not specify any meaning when stored in a string.\n can be stored in a string and will still convey its specific meaning of line break.
 */