import javax.swing.ImageIcon;

public class Queen extends Piece {
		
	int color;
	static ImageIcon white; 
	static ImageIcon black;
		
	public Queen() {
		super(white = new ImageIcon("src/images/d1_60x60_Queen2.png"));
	}
		
	public Queen(int color) {
		super(black = new ImageIcon("src/images/d1_60x60_Queen1.png"));
	}
}
