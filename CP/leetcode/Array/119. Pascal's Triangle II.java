/*
Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

             1
            1 1
           1 2 1
          1 3 3 1
         1 4 6 4 1

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33
 */


// see CP copy 
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rowVal = new ArrayList<>(); //list stores values of Integer type
        long ans = 1;//long is used to prevent integer overflow when calculating binomial coefficients, 
        //especially for larger rows of Pascal's triangle, where the values can be very large.
        rowVal.add((int) ans); //0th column added
        
        for(int col=1; col<=rowIndex; col++) {
            ans=ans*((rowIndex+1)-col); //since 0 rowindexed triangle & we considered 1 rowindexed triangle
            ans=ans/col;
            rowVal.add((int) ans);
        }
return rowVal;
    }
}

/*
Q:
overflow will not occur for the given constraint (i.e., 0 <= rowIndex <= 33). 
If overflow will not occur for the given constraint then what was the need for writing long?

The need for using long in this code, even though overflow won't occur for the given constraints (i.e., 0 <= rowIndex <= 33), 
arises primarily due to defensive programming and safety considerations.

Prevents overflow during intermediate calculations.
*/