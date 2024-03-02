// fuxn to check whether a given no. is even or odd
#include<stdio.h>
int evenodd(int);
main()
{int n,x;
printf("enter a no. ");
scanf("%d",&n);
x=evenodd(n);
}
int evenodd(int m)
{if(m%2==0){ 

printf("no. is even");
return(1); 
}
else{
printf("no. is odd");
 return(0);
    }
 }


