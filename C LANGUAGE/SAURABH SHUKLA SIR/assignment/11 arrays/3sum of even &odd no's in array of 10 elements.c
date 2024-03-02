//sum of all even & sum of all odd no's stored in array of size 10
#include<stdio.h>
main()
{int i,a[10],se=0,so=0;
printf("enter the no's");
for(i=0;i<=9;i++)
	scanf("%d",&a[i]);
for(i=0;i<=9;i++){
	if(a[i]%2==0)
		se=se+a[i];
	else
		so=so+a[i];
	}
printf("the sum of even no's=%d & sum of odd no's=%d",se,so);
}

