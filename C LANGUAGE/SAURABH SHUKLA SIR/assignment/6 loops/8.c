//HCF of two no.'s
#include<stdio.h>
main()
{int a,b,min;
printf("enter two no's");
scanf("%d%d",&a,&b);
min=a<b?a:b;
     while(min>=1){
     	if(a%min==0&&b%min==0)
     	break;
     	min--;
}printf("HCF of two no.'s is %d",min);
}
