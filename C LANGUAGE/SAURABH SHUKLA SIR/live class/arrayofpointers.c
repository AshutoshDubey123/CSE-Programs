#include<stdio.h>
void printmaxmarks(int **ptr,int len[]);
int main ()
{
    int a[]={30,40,20,90,60};
    int b[]={50,40,70,60,55,85,62};
    int c[]={80,45,75,59};
    int len[]={5,7,4};
    int*p[3];
    p[0]=a;
    p[1]=b;
    p[2]=c;
    printmaxmarks(p,len);
}
void printmaxmarks(int **ptr,int len[])
{
    int max,i,j;
    for(i=0;i<=2;i++)
    {
        max=*(*(ptr+i));
        for(j=1;j<len[i]-1;j++)
          if(max<*(*(ptr+i)+j))
              max=*(*(ptr+i)+j);
        printf("\n%d",max);
    }
}