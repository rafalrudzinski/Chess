
/*
 * Title:  Chess Program
 * 
 * Revision:  1.0
 * Author:  Justin Bee, Rafal Rudzinski, Nick Okerberg
 * 
 * Description:  This program will display a chessboard on the screen with
 * Player 1 (white) pieces and Player 2 (black) pieces in the appropriate
 * squares to start with.  The players can drag and drop the chess pieces
 * and play a game of chess.   
 * 
 * Instructions:  Execute the .jar file to run the program.
 * This has been tested as working on Windows 10.  
 * 
 * Revision History:
 * Date			Ver		Author				Description
 * 2016/10/02		1.0		Nick,Rafal,Justin 		Initial Release.
 */


// Define imports.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;


public class Chess {

	/*
	 * Define the main method for the Chess Program.
	 * This calls the ChessBoard class to build the 
	 * board and pieces.  
	 */
	public static void main(String[] args) throws IOException{
		
		// New ChessBoard JFrame.
		JFrame frame = new ChessBoard();
		
		// Implement the listener for the menu bar at the top of the screen.
		ListenerClass menuListener = new ListenerClass();
		    
		// Create the menu bar at the top. Create the "Game" drop-down selection.
		JMenuBar menu = new JMenuBar();
		JMenu Game;
		Game = new JMenu("Game");
		menu.add(Game);
		frame.setJMenuBar(menu);
		
		// Exit program when the window is closed.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add drop downs for the menu items.
		JMenuItem ExitGame = new JMenuItem("Exit");
		Game.add(ExitGame);
		  
		// Add a message string label at the top of the screen.
		JLabel messageString = new JLabel("     Playing Chess!");
		menu.add(messageString);
		
		// Set the board attributes.
		frame.setTitle("Chess");
		frame.pack();
		frame.setResizable(true);
		frame.setLocationRelativeTo( null );
		frame.setVisible(true);

		// Register Listener for Exit button in the menu.
		ExitGame.addActionListener(menuListener);
		  
		    
	} // End main.

} // End chess class.



/*
 * Define the ListenerClass that was implemented.
 * This takes action based on which button was pressed.
 */
class ListenerClass implements ActionListener{
	
	public void actionPerformed(ActionEvent e){

		// If exit button pressed, then close the program without error.
		if (e.getActionCommand() == "Exit"){
			System.out.println("Exit pressed");
			System.exit(0);
		}
		
		
	}
} // End ListenerClass.

