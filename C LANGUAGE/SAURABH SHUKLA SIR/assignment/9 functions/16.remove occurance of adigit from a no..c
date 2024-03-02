//remove all occurance of a given digit from a given no.
#include<stdio.h>
#include<math.h>
void delete(int,int);
main()
{int m,	n;
printf("enter the no. & the digit to be removed from the no.");
scanf("%d%d",&m,&n);
delete(m,n);
 } 
 void delete(int x,int y)
 {
    int a,c,sum=0,m=0;
    a=x;
 	while(a!=0)
 	{
 		c=a%10;
        if (c!=y)
 		{
            sum=c*pow(10,m)+sum;
            m++;
        }
 		a=a/10;	
	}
    printf("%d\n",sum);
}
