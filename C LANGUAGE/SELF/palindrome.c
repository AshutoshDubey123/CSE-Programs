#include<stdio.h>
main()
{int i,n,rev=0;
printf("enter any number");
scanf("%d",&n);
i=n;
while(n!=0)
{rev=rev*10+n%10;

n=n/10;
}
printf("%d\n",rev);
printf("%d\n",i);
if (rev==i)
printf("palindrome no.\n");
else
printf("not palindrome no.\n");
}
