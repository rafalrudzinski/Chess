import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Chess {
	public static void main(String[] args) throws IOException {
		  JFrame frame = new ChessBoard();
		  JMenuBar menu = new JMenuBar();
		  JMenu Game;
		  JMenu ExitGame;
		  Game = new JMenu("Game");
		  ExitGame = new JMenu("Exit");
		  menu.add(Game);
		  menu.add(ExitGame);
		  frame.setJMenuBar(menu);
		  //add drop downs for the menu items
		  JMenuItem StartGame = new JMenuItem("Start");
		  Game.add(StartGame);
		  frame.setTitle("Chess");
		  frame.pack();
		  frame.setResizable(true);
		  frame.setLocationRelativeTo( null );
		  frame.setVisible(true);
		 }
}
