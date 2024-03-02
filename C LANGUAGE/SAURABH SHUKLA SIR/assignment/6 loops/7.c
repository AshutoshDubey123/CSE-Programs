//LCM of two no's
#include<stdio.h>
main()
{
	int a,b,max;
	printf("enter two no's");
	scanf("%d%d",&a,&b);
	max=a>b?a:b;
for( ; ; ){
	if(max%a==0&&max%b==0)
break;
else
max++;
}printf("lcm of two no's is %d",max);
}
