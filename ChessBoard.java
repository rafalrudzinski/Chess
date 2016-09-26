import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ChessBoard extends JFrame{
 JFrame board = new JFrame();
 JPanel squares[][] = new JPanel[8][8];
 
 public ChessBoard() throws IOException{
	 
	    
		board.setSize(600, 600);
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
		    for (int j = 0; j < 8; j++) 
		      {
		        squares[i][j] = new JPanel();

		            if ((i + j) % 2 == 0) {
		                squares[i][j].setBackground(Color.black);
		            } else {
		                squares[i][j].setBackground(Color.white);
		            }   
		            board.add(squares[i][j]);//add the chess board to the frame
		        }
		    }
		    board.setVisible(true);
     
  
		   
		   
			squares[0][0].add(new Pawn());
			
		
		    
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

