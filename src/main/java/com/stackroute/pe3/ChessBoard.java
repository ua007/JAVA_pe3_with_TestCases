package com.stackroute.pe3;

public class ChessBoard
{
    public String[][] chessBoard(int x)
    {
        String[][] board=new String[x][x];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                if((i+j)%2==0)
                {
                    board[i][j]="WW|";
                }
                else
                {
                    board[i][j]="BB|";
                }
            }
        }
        String[][] arr={{"WW|","BB|"},{"BB|","WW|"}};

        return board;
    }
}