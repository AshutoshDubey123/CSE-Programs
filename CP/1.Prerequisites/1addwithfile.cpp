/*
  your code will have input and output file within.
  This program will run correctly when it is submitted on the platform which has testcases on the name of the files
  i/p file: addin.txt
  o/p file: addout.txt
  The input file will cosist of 2 integers a & b,separated by a single space.
  The output file should consist a single integer, the sum of a & b
  This program will run correctly only when it is submitted on the platform which has testcases within the name of the file output displayed through the mentioned file.
  */
 #include<bits/stdc++.h>
 using namespace std;
 int main()
{   freopen("addin.txt","r",stdin);//r means read from file
    freopen("addout.txt","w",stdout);//w means write into file
    int a,b;
    cin >> a >> b;
    int sum = a+b;
    cout << sum << endl;
    return 0;

}
//NOTE:This program will run correctly only when it is submitted on the platform which has testcases within the name of the file & output displayed through the mentioned file.