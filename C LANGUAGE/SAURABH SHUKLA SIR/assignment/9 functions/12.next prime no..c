//next prime no. of a given no.
#include<stdio.h>
int prime(int);
main()
{int n,no;
	printf("enter a  no.");
	scanf("%d",&n);
	printf("next prime no. is");
	no=prime(n);
	printf("%d",no);
}
int prime(int n)
{int i,count=0;
while(n>0){
	n++;
	count=0;
for(i=2;i<n;i++){
if(n%i==0)
count++;
           		}
if(count==0)
return n;
          }
}

