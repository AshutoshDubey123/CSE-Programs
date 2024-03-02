//recursive fxn. to calculate hcf of two no's
#include<stdio.h>
int hcf(int,int);
main()
{	int x,y,z;
	printf("enter two no's ");
	scanf("%d%d",&x,&y);
	printf("the hcf of two no's is: ");
	z=hcf(x,y);
	printf("%d",z);
}
int hcf(int x,int y)
{	int rem;
	rem=x%y;
if(rem==0)
	return y;
else 
	return(hcf(y,rem));
}
