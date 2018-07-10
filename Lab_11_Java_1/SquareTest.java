//Java Program    SquareTest.java
//Course          CSE 1301J -002
//Name:           Juan Aguirre
//Assignment:     Lab 11
//Due date:       11/13/2014
// ****************************************************************
// SquareTest.java
//
// purpose: Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************
import java.io.*;
import java.util.Scanner;

public class SquareTest
{
   public static void main(String[] args) throws IOException
   {
      Scanner scan = new Scanner(new File("magicFile.txt"));
   
      int count = 1;                 //count which square we're on
      int size = scan.nextInt();     //size of next square
   
   //Expecting -1 at bottom of input file
      while (size != -1)
      {
       
      //create a new Square of the given size
        
        Square Square = new Square(size);
      //call its read method to read the values of the square
      Square.readSquare(scan);
      
         System.out.println("\n******** Square " + count + " ********");
      //print the square
      Square.printSquare();
      
      //print the sums of its rows
      for(int i = 0; i<size; i++)
      {
      System.out.println("sums of row " + i + "\t" + Square.sumRow(i));
      
      //print the sums of its columns
      System.out.println("sums of col " + i + "\t" +  Square.sumCol(i));
      }
      //print the sum of the main diagonal            
      System.out.println("sum of main diagonal " + Square.sumMainDiag());
      
      //print the sum of the other diagonal
      System.out.println(" sum of other diagonal " + Square.sumOtherDiag()); 
      
      //determine and print whether it is a magic square
      if(Square.isMagic())
      System.out.println(" The Square is magic " );
      else
      System.out.println(" The  Square is not magic " );

      
      //get size of next square
         size = scan.nextInt();
         count++;
      
      }
    System.out.println("Coded by Juan Aguirre");
   }
}


