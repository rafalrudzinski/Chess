/*
 * Icon URL:  https://commons.wikimedia.org/wiki/Category:PNG_chess_pieces/Standard_transparent
 * 
 */



import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JButton;


public class ChessBoard extends JFrame {

	JFrame board = new JFrame();
	JButton squares[][] = new JButton[8][8];  // was JPanel

 

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
     ListenerClass[][] test = new ListenerClass[8][8]; // Init listeners for all button squares.
     for (int i = 0; i < 8; i++) {
    	 for (int j = 0; j < 8; j++) {
    		 squares[i][j] = new JButton();  // was JPanel
    		 if ((i + j) % 2 == 0) {
    			 squares[i][j].setBackground(Color.blue);
    			 
    		 } else {
    			 squares[i][j].setBackground(Color.white);
             }   
    		 
          	 board.add(squares[i][j]);//add the chess board to the frame

     		 // Reg listeners for all button squares.
    		 squares[i][j].addActionListener(test[i][j]); 
    		 
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
     
     Rook p1rook1 = new Rook(1);
     Rook p1rook2 = new Rook(1);
     Knight p1knight1 = new Knight(1);
     Knight p1knight2 = new Knight(1);
     Bishop p1bishop1 = new Bishop(1);
     Bishop p1bishop2 = new Bishop(1);
     Queen p1queen = new Queen(1);
     King p1king = new King(1);
     
     squares[6][0].add(p1pawn1.getPawn());
     squares[6][1].add(p1pawn2.getPawn());
     squares[6][2].add(p1pawn3.getPawn());
     squares[6][3].add(p1pawn4.getPawn());
     squares[6][4].add(p1pawn5.getPawn());
     squares[6][5].add(p1pawn6.getPawn());
     squares[6][6].add(p1pawn7.getPawn());
     squares[6][7].add(p1pawn8.getPawn());
     
     squares[7][0].add(p1rook1.getRook());
     squares[7][7].add(p1rook2.getRook());
     squares[7][1].add(p1knight1.getKnight());
     squares[7][6].add(p1knight2.getKnight());
     squares[7][2].add(p1bishop1.getBishop());
     squares[7][5].add(p1bishop2.getBishop());
     squares[7][3].add(p1queen.getQueen());
     squares[7][4].add(p1king.getKing());
     
	 /*
	  * Create the objects for Player 2 to start the game. 
	  */
     Pawn p2pawn1 = new Pawn(2);
     Pawn p2pawn2 = new Pawn(2);
     Pawn p2pawn3 = new Pawn(2);
     Pawn p2pawn4 = new Pawn(2);
     Pawn p2pawn5 = new Pawn(2);
     Pawn p2pawn6 = new Pawn(2);
     Pawn p2pawn7 = new Pawn(2);
     Pawn p2pawn8 = new Pawn(2);
     Queen p2queen = new Queen(2);
     King p2king = new King(2);
     
     Rook p2rook1 = new Rook(2);
     Rook p2rook2 = new Rook(2);
     Knight p2knight1 = new Knight(2);
     Knight p2knight2 = new Knight(2);
     Bishop p2bishop1 = new Bishop(2);
     Bishop p2bishop2 = new Bishop(2);
     
     squares[1][0].add(p2pawn1.getPawn());
     squares[1][1].add(p2pawn2.getPawn());
     squares[1][2].add(p2pawn3.getPawn());
     squares[1][3].add(p2pawn4.getPawn());
     squares[1][4].add(p2pawn5.getPawn());
     squares[1][5].add(p2pawn6.getPawn());
     squares[1][6].add(p2pawn7.getPawn());
     squares[1][7].add(p2pawn8.getPawn());
     
     squares[0][0].add(p2rook1.getRook());
     squares[0][7].add(p2rook2.getRook());
     squares[0][1].add(p2knight1.getKnight());
     squares[0][6].add(p2knight2.getKnight());
     squares[0][2].add(p2bishop1.getBishop());
     squares[0][5].add(p2bishop2.getBishop());
     squares[0][3].add(p2queen.getQueen());
     squares[0][4].add(p2king.getKing());
     
     
     

     
     
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
