//find greatest elements in array of size 10
#include<stdio.h>
main()
{int a[10],i,max;
printf("enter the no's");
for(i=0;i<=9;i++)
	scanf("%d",&a[i]);
max=a[0];
for(i=1;i<=9;i++){
	if(a[i]>max)
	max=a[i];
	}
printf("the maximum no. is %d",max);
}


