/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

             1
            1 1
           1 2 1
          1 3 3 1
         1 4 6 4 1
 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30*/
class Solution {
    public List<List<Integer>> generate(int numRows) {//Each inner list (List<Integer>) will represent a row of Pascal's triangle, 
    //and the outer list (List<List<Integer>>) will represent all the rows.
        List<List<Integer>> res = new ArrayList<>();//This creates a list called res that will store all rows of Pascal's triangle.
        List<Integer> row1 = new ArrayList<>();//1st row
        row1.add(1); //1st row has only one element
        res.add(row1); //1st row added to resultant triangle
        for (int i = 1; i < numRows; i++) {
            List<Integer> prow = res.get(i - 1); //previous row
            List<Integer> nrow = new ArrayList<>();// new row

            nrow.add(1);  //1st element of each row is 1
            for (int j = 1; j < i; j++)   //each row has number of element equal to its row number
            {
                nrow.add(prow.get(j - 1) + prow.get(j));
            }
            nrow.add(1); //last element of each row is 1
            res.add(nrow);
        }
        return res;
    }
}