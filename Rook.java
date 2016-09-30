import javax.swing.ImageIcon;

public class Rook extends Piece {
	int color;
	static ImageIcon white; 
	static ImageIcon black;
		
	public Rook() {
		super(white = new ImageIcon("src/images/d1_60x60_Rook2.png"));
	}
		
	public Rook(int color) {
		super(black = new ImageIcon("src/images/d1_60x60_Rook1.png"));
	}
}
