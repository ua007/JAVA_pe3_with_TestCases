//input two matrix and print the addition of the matrix

package com.stackroute.pe3;

public class MatrixAddition {
    public int[][] addMatrix(int[][] A, int[][] B)
    {
        if(A.length!=B.length)
        {
            return null;
        }

        if(A[0].length!=B[0].length)
        {
            return null;
        }

        int[][] C=new int[A.length][A[0].length];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        return C;
    }
}
