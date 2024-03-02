//permutation
#include<stdio.h>
int permu(int,int);
int fact(int);
main()
{int n,r,p;
printf("enter the no. of items to be selected \n & no.of items to be selected at a time ");
scanf("%d%d",&n,&r);
p=permu(n,r);
printf("%d",p);
}
int fact(int n)
{int i=1;
while(n>0)
{i=i*n;
n--;}
return i;
}
int permu(int n,int r)
{int permu;
	permu=fact(n)/fact(n-r);
	return permu;
}
