/*https://orac.amt.edu.au/cgi-bin/train/problem.pl?set=simple1&problemid=362

In this task you are given a fraction in the form n/d, where 1 <= d < n <= 1,000,000,000. Your task is to find the two integers a and b, 
where 0 <= b < d and ad + b = n. You do not need to (and shouldn't) simplify the fraction.

Input
A single line containing the integers n and d separated by a space.

Output
If b is not 0, print a single line in the format a b/d. Otherwise, print a.
Sample Input 1
22 6
Sample Output 1
3 4/6
Sample Input 2
49 7
Sample Output 2
7
*/
#include<bits/stdc++.h>
using namespace std;
int main()
{   int n,d,a,b;
    cin>>n>>d;
    a=n/d;
    b=n%d;

 if(b!=0)
    cout<<a<<" "<<b <<"/"<<d<<endl;
else
cout<<a<<endl;
return 0;
}