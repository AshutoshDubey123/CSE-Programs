#include<stdio.h>
main(){
int n,i=1,table;
printf("enter the number of which the table is required");
scanf("%d",&n);
while(i<=10)
{table=n*i;
i++;

printf("%d\n",table);
}
}

