//check whether two no.'s are co-prime or not
#include<stdio.h>
main(){
int a,b,min,i;
printf("enter two no's");
scanf("%d%d",&a,&b);
min=a<b?a:b;
for(i=2;i<=min;i++){
if(a%i==0&&b%i==0)
break;}
if(i==min+1)
printf("%d & %d are co-prime",a,b);
else
printf("%d & %d are not co-prime",a,b);
}

