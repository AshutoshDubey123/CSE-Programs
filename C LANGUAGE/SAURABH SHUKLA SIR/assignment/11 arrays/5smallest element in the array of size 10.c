//find smallest elements in array of size 10
#include<stdio.h>
main()
{int a[10],i,min;
printf("enter the no's");
for(i=0;i<=9;i++)
	scanf("%d",&a[i]);
min=a[0];
for(i=1;i<=9;i++){
	if(a[i]<min)
	min=a[i];
	}
printf("the smallest no. is %d",min);
}


