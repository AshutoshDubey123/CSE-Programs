#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void main()
{
    clock_t start,end;
    start=clock();
    int *p,n,i,j,t;
    printf("enter the size of array: ");
    scanf("%d",&n);
    p=(int *)malloc(sizeof(int));
    for(i=0;i<n;i++)
        *(p+1)=rand()%n;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-1;j++)
        {
            if(*(p+j)>*(p+j+1))
            {
                t=*(p+j);
                *(p+j)=*(p+j+1);
                *(p+j+1)=t;
            }
        }
    }
    printf("the list after sorting the array in bubble sort: ");
    for(i=0;i<n;i++)
      printf("%d  ",*(p+i));
    end=clock();
    double duration=((double)end-start)/CLOCKS_PER_SEC;
    printf("\nTime taken to execute in second: %f\n",duration);

}

