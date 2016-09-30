import java.awt.*;
import javax.swing.*;

public class ChessBoard extends JFrame {
	
	public JLayeredPane pane;
	public JPanel board;
	public Square square;
	public Pawn pawn;
	public Queen queen;
	public King king;
	public Bishop bishop;
	public Knight knight;
	public Rook rook;
	
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
			square = new Square(i);
			board.add(square);
			
			// set alternating colors
			int row = (i/8) % 2;			
			if (row == 0) {
				if (i % 2 == 0) {
					square.setBackground(Color.white);
				} else {
					square.setBackground(Color.blue);
				}
			} else {
				if (i % 2 == 0) {
					square.setBackground(Color.blue);
				} else {
					square.setBackground(Color.white);
				}
			}
		}
		
		//set up board, add pieces
		JPanel panel;
		
		//kings
		king = new King(0);
		king.setSize(50,50);
		panel = (JPanel)board.getComponent(59);
		panel.add(king);
		king = new King();
		king.setSize(50,50);
		panel = (JPanel)board.getComponent(3);
		panel.add(king);
		//queens
		queen = new Queen(0);
		queen.setSize(50,50);
		panel = (JPanel)board.getComponent(4);
		panel.add(queen);
		queen = new Queen();
		queen.setSize(50,50);
		panel = (JPanel)board.getComponent(60);
		panel.add(queen);
		//bishops
		bishop = new Bishop(0);
		bishop.setSize(50,50);
		panel = (JPanel)board.getComponent(61);
		panel.add(bishop);
		bishop = new Bishop(0);
		bishop.setSize(50,50);
		panel = (JPanel)board.getComponent(58);
		panel.add(bishop);
		bishop = new Bishop();
		bishop.setSize(50,50);
		panel = (JPanel)board.getComponent(2);
		panel.add(bishop);
		bishop = new Bishop();
		bishop.setSize(50,50);
		panel = (JPanel)board.getComponent(5);
		panel.add(bishop);
		//knights
		knight = new Knight();
		knight.setSize(50,50);
		panel = (JPanel)board.getComponent(62);
		panel.add(knight);
		knight = new Knight();
		knight.setSize(50,50);
		panel = (JPanel)board.getComponent(57);
		panel.add(knight);
		knight = new Knight(0);
		knight.setSize(50,50);
		panel = (JPanel)board.getComponent(1);
		panel.add(knight);
		knight = new Knight(0);
		knight.setSize(50,50);
		panel = (JPanel)board.getComponent(6);
		panel.add(knight);
		//rooks
		rook = new Rook(0);
		rook.setSize(50,50);
		panel = (JPanel)board.getComponent(0);
		panel.add(rook);
		rook = new Rook(0);
		rook.setSize(50,50);
		panel = (JPanel)board.getComponent(7);
		panel.add(rook);
		rook = new Rook();
		rook.setSize(50,50);
		panel = (JPanel)board.getComponent(56);
		panel.add(rook);
		rook = new Rook();
		rook.setSize(50,50);
		panel = (JPanel)board.getComponent(63);
		panel.add(rook);
		
		//pawns
		for (int i = 0; i < 64; i++) {
			//pawns
			if (i > 7 && i < 16) {
				pawn = new Pawn(0);
				pawn.setSize(50, 50);
				panel = (JPanel)board.getComponent(i);
				panel.add(pawn);
			}
			if (i > 47 && i < 56) {
				pawn = new Pawn();
				pawn.setSize(50, 50);
				panel = (JPanel)board.getComponent(i);
				panel.add(pawn);
			}
		}
	}
}
