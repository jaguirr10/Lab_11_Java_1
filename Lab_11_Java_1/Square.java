//Java Program      Square.java
//Course            CSE 1301J -002
//Name:             Juan Aguirre
//Assignment #:     Lab 11
//Due date:         11/13/2014

import java.util.Scanner;

public class Square
{
    int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
      square = new int[size][size];
    
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
      int total = 0;
      for(int j = 0; j<square.length; ++j)
         total += square[row][j];
      return total;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
      int total = 0;
      for(int i = 0; i<square.length; ++i)
         total += square[i][col];
      return total;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
      int total = 0;
      for(int i = 0; i<square.length; ++i)
            total += square[i][i];
      return total;
     }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
      int total = 0;
      for(int j = 0; j<square.length; ++j)
           total += square[j][square.length-j-1];
      return total;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean isMagic()
    {
      int save = sumMainDiag();
      for(int i = 0; i<square.length; ++i)
      {
         if(save != sumRow(i))
         {
            return false;
         }
         if(save != sumCol(i))
         {
            return false;
         }
       }
      if(save != sumOtherDiag())
      {
         return false;
      }
      return true;
    }

    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
    public void readSquare(Scanner scan)
    {
      for (int row = 0; row < square.length; row++)
	  for (int col = 0; col < square.length; col ++)
	    square[row][col] = scan.nextInt();
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
      for(int i = 0; i<square.length; ++i)
      {
         for(int j = 0; j<square.length; ++j)
             System.out.print(square[i][j] + "\t");
          System.out.println();
      }

    }

}
