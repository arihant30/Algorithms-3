
// Java implementation to find the
// maximum sum path in a matrix
import java.io.*;
 
class MaxSumPath {
//int mat[][];
 
// function to find the maximum
// sum path in a matrix
static int maxSum(int[][] mat, int n)
{
    // if there is a single element only
    if (n == 1)
        return mat[0][0];
 
    // dp[][] matrix to store the results
    // of each iteration
    int dp[][] = new int[n][n];
    int maxSum = Integer.MIN_VALUE, max;
 
    // base case, copying elements of
    // last row
    for (int j = 0; j < n; j++)
        dp[n - 1][j] = mat[n - 1][j];
 
    // building up the dp[][] matrix
    // from bottom to the top row
    for (int i = n - 2; i >= 0; i--) {
        for (int j = 0; j < n; j++) {
            max = Integer.MIN_VALUE;
 
            // finding the maximum diagonal
            // element in the (i+1)th row
            // if that cell exists
            if (((j - 1) >= 0) &&
                 (max < dp[i + 1][j - 1]))
                 max = dp[i + 1][j - 1];
            if (((j + 1) < n) &&
                (max < dp[i + 1][j + 1]))
                max = dp[i + 1][j + 1];
 
            // adding that 'max' element
            // to the mat[i][j] element
            dp[i][j] = mat[i][j] + max;
        }
    }
 
    // finding the maximum value from
    // the first row of dp[][]
    for (int j = 0; j < n; j++)
        if (maxSum < dp[0][j])
            maxSum = dp[0][j];
 
    // required maximum sum
    return maxSum;
}
 
    // Driver code
    public static void main (String[] args) {
     
    int mat[][] = { { 5, 6, 1, 7 },
                    { -2, 10, 8, -1 },
                    { 3, -7, -9, 11 },
                    { 12, -4, 2, 6 } };
    int n = 4;
 
    System.out.println("Maximum Sum = "+
                        maxSum(mat , n));
 
    }
}
 
// This code is contributed by Prerna Saini
