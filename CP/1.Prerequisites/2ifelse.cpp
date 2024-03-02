/*
r no. of rows and s no. seats in each row
no of people that will visit is equal to no of tickets sold
if no. of tickets, "no_tickets" are more than r*s(no. of sits) then "no_tickets-r*s" will stand
*/
#include<bits/stdc++.h>
using namespace std;
int main()
{int r,s,nos,no_tickets,sit,stand;
cin >> r >> s;//this will create space separated inputs
cin>>no_tickets;
nos=r*s;
if(no_tickets>=nos)
cout<< nos<<" "<<no_tickets-nos<<endl;  //" "is for space
else
cout<<no_tickets<<" "<<0<<endl;
return 0;

}