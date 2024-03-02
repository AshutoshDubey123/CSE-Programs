//armstrong no. in a given range 
#include<stdio.h>
#include<math.h>
void armstrong(int,int);
main()
{int n1,n2;
	printf("enter the range");
	scanf("%d%d",&n1,&n2);
	armstrong(n1,n2);
}
void armstrong(int n1,int n2)
{int n,x,count,y,sum=0;
	for(n=n1;n<=n2;n++){
	
	count=0;
	sum=0;
	
	  x=n;
	  while(x!=0)
	  {
	  	x=x/10;
	  	count++;
		  }
		  x=n;
	  while(x!=0)
	  {y=x%10;
	  	sum=sum+pow(y,count);
	  	x=x/10;
		  }	
	if(sum==n)
	printf("%d\n",sum);
	}
	}
