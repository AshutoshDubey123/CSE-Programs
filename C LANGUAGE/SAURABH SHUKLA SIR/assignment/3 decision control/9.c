#include<stdio.h>
main()
{int a,b,c;
printf("enter three numbers");
scanf("%d%d%d",&a,&b,&c);
printf("%d",a>b?a>c?a:c:b>c?b:c);

}
