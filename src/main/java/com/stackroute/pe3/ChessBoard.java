package com.stackroute.pe3;
//chess pattern print

public class ChessBoard {
    String[][] chess;
    int rows,columns;

    public void matrixInitialise(int rows)
    {
        this.rows=rows;
        this.columns=rows;
        chess=new String[rows][columns];//matrix is initiaised with rows

    }
    public String setChess()
    {    int counter=0; String chessboardresult="";//variables initialised
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                chess[i][j]=(counter++%2==0)?"BB":"WW";//conditions checked
                chessboardresult= chessboardresult.concat(chess[i][j]).concat(" ");//space concated
            }
            chessboardresult=chessboardresult.concat("\n");//newline added
        }return chessboardresult;
    }
}