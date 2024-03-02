//print prime no.b/w 2 given no.
#include<stdio.h>
main()
{int a,b ,n,count,i;
printf("enter 2 no's\n");
scanf("%d%d",&a,&b);
for(n=a;n<=b;n++){
	count=0;
	for(i=1;i<=b;i++){
		if(n%i==0)
		count++;}
		if(count==2)
		printf("%d ",n);}
}
