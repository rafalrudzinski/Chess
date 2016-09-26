/*
 * Icon URL:  https://commons.wikimedia.org/wiki/Category:PNG_chess_pieces/Standard_transparent
 * 
 */



import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ChessBoard extends JFrame {

	JFrame board = new JFrame();
	JPanel squares[][] = new JPanel[8][8];

 

 public ChessBoard() throws IOException {
	 
	 board.setSize(800, 800);
	 board.setLayout(new GridLayout(8, 8));
	 board.setTitle("Chess Game");

	 board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 // Create a menubar with the buttons

	 JMenuBar menu = new JMenuBar();
     JMenu Game;
     JMenu ExitGame;
     Game = new JMenu("Game");
     ExitGame = new JMenu("Exit");
     menu.add(Game);
     menu.add(ExitGame);
     board.setJMenuBar(menu);
    
     //add drop downs for the menu items
     JMenuItem StartGame = new JMenuItem("Start");
     Game.add(StartGame);
 

     /*       
      * 
      * for loop to create the chess board
      * alternating between black and white squares
      * 	    
      */
     for (int i = 0; i < 8; i++) {
    	 for (int j = 0; j < 8; j++) {
    		 squares[i][j] = new JPanel();
    		 if ((i + j) % 2 == 0) {
    			 squares[i][j].setBackground(Color.blue);
    		 } else {
    			 squares[i][j].setBackground(Color.white);
             }   

             board.add(squares[i][j]);//add the chess board to the frame

    	 }
     }

     board.setVisible(true);

     

	 /*
	  * Create the objects for Player 1 to start the game. 
	  */
     Pawn p1pawn1 = new Pawn(1);
     Pawn p1pawn2 = new Pawn(1);
     Pawn p1pawn3 = new Pawn(1);
     Pawn p1pawn4 = new Pawn(1);
     Pawn p1pawn5 = new Pawn(1);
     Pawn p1pawn6 = new Pawn(1);
     Pawn p1pawn7 = new Pawn(1);
     Pawn p1pawn8 = new Pawn(1);
     
     squares[6][0].add(p1pawn1.getPawn());
     squares[6][1].add(p1pawn2.getPawn());
     squares[6][2].add(p1pawn3.getPawn());
     squares[6][3].add(p1pawn4.getPawn());
     squares[6][4].add(p1pawn5.getPawn());
     squares[6][5].add(p1pawn6.getPawn());
     squares[6][6].add(p1pawn7.getPawn());
     squares[6][7].add(p1pawn8.getPawn());
     
     
	 /*
	  * Create the objects for Player 1 to start the game. 
	  */
     Pawn p2pawn1 = new Pawn(2);
     Pawn p2pawn2 = new Pawn(2);
     Pawn p2pawn3 = new Pawn(2);
     Pawn p2pawn4 = new Pawn(2);
     Pawn p2pawn5 = new Pawn(2);
     Pawn p2pawn6 = new Pawn(2);
     Pawn p2pawn7 = new Pawn(2);
     Pawn p2pawn8 = new Pawn(2);
     
     squares[1][0].add(p2pawn1.getPawn());
     squares[1][1].add(p2pawn2.getPawn());
     squares[1][2].add(p2pawn3.getPawn());
     squares[1][3].add(p2pawn4.getPawn());
     squares[1][4].add(p2pawn5.getPawn());
     squares[1][5].add(p2pawn6.getPawn());
     squares[1][6].add(p2pawn7.getPawn());
     squares[1][7].add(p2pawn8.getPawn());
     
 }



 

 public static void main(String[] args) throws IOException {

            

   new ChessBoard();


   
    

 }

}



class ListenerClass implements ActionListener {

   public void actionPerformed(ActionEvent e) {

     System.out.println("The " + e.getActionCommand() + " button "

                + "is clicked at\n  " + new java.util.Date(e.getWhen()));

   }

 }
