package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard ob;
    @Before
    public void setUp() throws Exception {
        ob=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenAnIntegerShouldreturnAChessBoard()
    {
        String[][] res=ob.chessBoard(2);
        String[][] exp={{"WW|","BB|"},{"BB|","WW|"}};
        assertEquals(exp,res);
    }
}