import java.util.*;
public class Matrix
{   public static boolean search(int matrix[][],int key)
    {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){

                if(matrix[i][j]==key){
                System.out.println(key+" found at cell ("+i+","+j+")");
                return true;
                }
            }
       }
        System.out.println("key not found");
        return false;
    }

    public static int largest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
        }
        return largest;
    }


    public static int smallest(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
            }
        }
        return smallest;
    }



    public static void main(String args[])
    {
        int matrix[][]=new int [3][3];

        int m =matrix.length;//represents the number of row i.e., 1st array in [][]
        int n=matrix[0].length;//represents the number of column in the row here we considered row 0 to get the value

        Scanner sc =new Scanner(System.in);
        
        //taking input for the 2d array
        for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]=sc.nextInt();
            }
        }

        //printing the 2d array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
        System.out.println();
        }

        search(matrix,5);

        System.out.println("The largest element is :"+largest(matrix));

        System.out.println("The smllest element is :"+smallest(matrix));

    }
}

/*
OUTPUT:
1 2 3 4 5 6 7 8 9 
1 2 3 
4 5 6 
7 8 9 
5 found at cell (1,1)
The largest element is :9
The smllest element is :1
 */