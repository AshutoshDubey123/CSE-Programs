import java.util.*;
public class SpiralMatrix{
    public static void spiralMatrix(int matrix[][])
    {   int startRow=0;
        int startColumn=0;
        int endRow=matrix.length-1;
        int endColumn=matrix[0].length-1;

        while(startRow<=endRow && startColumn<=endColumn)
        {
        //top boundary
        for(int j=startColumn;j<=endColumn;j++)//variable j for column and i for row
        {
            System.out.print(matrix[startRow][j]+" ");
        }

        //right boundary
        for(int i=startRow+1;i<=endRow;i++)//already startRow printed in top for loop
        {
            System.out.print(matrix[i][endColumn]+" ");
        }


        // bottom boundary
        for(int j=endColumn-1;j>=startColumn;j--)
        {   if(startRow==endRow) //This condition is for single element spiral
               break;//If the element is printed through top boundary condition no need to print that same element through bottom boundary condition
            System.out.print(matrix[endRow][j]+" ");
        }

        //left boundary
        for(int i=endRow-1;i>=startRow+1;i--)
        {   if(startColumn==endColumn) //This condition is for single element spiral 
              break; //If the element is printed through right boundary condition no need to print that same element through left boundary condition
            System.out.print(matrix[i][startColumn]+" ");
        }
        startRow ++;
        endRow--;
        startColumn++;
        endColumn--;

        }
        
    }
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(matrix);
        
    }
}

/*
output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
 */