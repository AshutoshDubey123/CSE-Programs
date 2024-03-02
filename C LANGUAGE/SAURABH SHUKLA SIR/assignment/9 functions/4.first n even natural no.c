//fuxn to print first n even natural no's
#include<stdio.h>
void evenatu(int);
main()
{int n;
printf("enter the limit ");
scanf("%d",&n);
evenatu(n);
}
void evenatu(int x)
{int i;
  for(i=1;i<=x;i++)
 {int c;
  c=i*2;
  printf("%d\n",c);
 }
}

