
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JLabel;




public class Chess {

	public static void main(String[] args) throws IOException{

		  JFrame frame = new ChessBoard();
		  ListenerClass menuListener = new ListenerClass();
		    
		  JMenuBar menu = new JMenuBar();
		  JMenu Game;
		  Game = new JMenu("Game");
		  menu.add(Game);
		  frame.setJMenuBar(menu);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  //add drop downs for the menu items
		  JMenuItem StartGame = new JMenuItem("Start");
		  JMenuItem ExitGame = new JMenuItem("Exit");
		  Game.add(StartGame);
		  Game.add(ExitGame);
		  
		  JLabel messageString = new JLabel("     Ready to start!");
		  menu.add(messageString);
		  
		  frame.setTitle("Chess");
		  frame.pack();
		  frame.setResizable(true);
		  frame.setLocationRelativeTo( null );
		  frame.setVisible(true);

		  // Register Listeners for Start and Exit.
		  StartGame.addActionListener(menuListener);
		  ExitGame.addActionListener(menuListener);
		  
		    
	}

}


class ListenerClass implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		
		// If start button pressed, then start a new game.
		if (e.getActionCommand() == "Start"){
			System.out.println("Start pressed");

		}
		// If exit button pressed, then close the program without error.
		if (e.getActionCommand() == "Exit"){
			System.out.println("Exit pressed");
			System.exit(0);
		}
		
		
	}

}

