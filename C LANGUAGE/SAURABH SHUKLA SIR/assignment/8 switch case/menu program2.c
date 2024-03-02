#include<stdio.h>
#include<stdlib.h>
main()
{int check;
int a,b,c;
printf("\n1 check if set of 3 nos are length of isosceles triangle or not");
printf("\n2 check if set of 3 nos are length of right angled triangle or not");
printf("\n3 check if set of 3 nos are length of equilateral triangle or not");
printf("\n4 exit");
printf("\n select an option");
scanf("%d",&check);
switch(check)
{case 1:printf("enter the length of sides of triangle");
        scanf("%d%d%d",&a,&b,&c);
		if(a==b&&a!=c||b==c&&b!=a||c==a&&c!=b)
        printf("lengths form isosceles triangle");
        else
        printf("lengths don't form isosceles triangle");
        break;
 case 2:printf("enter the length of sides of triangle");
        scanf("%d%d%d",&a,&b,&c);
		if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a)
        printf("lengths form right angled triangle");
        else
        printf("lengths  don't form right angled triangle");
        break;
 case 3:printf("enter the lengths of sides of triangle");
        scanf("%d%d%d",&a,&b,&c);
		if(a==b&&a==c)
		printf("given length form equilateral triangle");
		else 
		printf("given length  don't form equilateral triangle");
		break;
case 4:exit(0);
break;
default : printf("wrong input");
}
}
