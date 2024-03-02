#include <stdio.h>

main()
{
int a;
printf("enter a number");
scanf("%d",&a);
a%2?printf("%d is odd",a) : printf("%d is even",a);
}
