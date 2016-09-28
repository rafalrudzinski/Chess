import java.awt.*;
import javax.swing.*;

public class ChessBoard extends JFrame {
	JLayeredPane pane;
	JPanel board;
	//Square square;
	
	public ChessBoard() {
		
		/*
		 * create Chess Board using a JLayeredPane
		 */
		Dimension boardSize = new Dimension(600,600);	// size of chess board
		pane = new JLayeredPane();
		getContentPane().add(pane);
		pane.setPreferredSize(boardSize);
		
		board = new JPanel();
		pane.add(board, JLayeredPane.DEFAULT_LAYER);
		board.setLayout(new GridLayout(8,8));
		board.setPreferredSize(boardSize);
		board.setBounds(0, 0, boardSize.width, boardSize.height);
		
		
		/*
		 * for loop creates 64 alternating color squares on Chess board
		 */
		for (int i = 0; i < 64; i++) {
			JPanel square = new JPanel();
			board.add(square);
			
			// set alternating colors
			int row = (i/8) % 2;			
			if (row == 0) {
				if (i % 2 == 0) {
					square.setBackground(Color.black);
				} else {
					square.setBackground(Color.white);
				}
			} else {
				if (i % 2 == 0) {
					square.setBackground(Color.white);
				} else {
					square.setBackground(Color.black);
				}
			}
		}
	}
}
