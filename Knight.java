import javax.swing.ImageIcon;

public class Knight extends Piece {
	int color;
	static ImageIcon white; 
	static ImageIcon black;
		
	public Knight() {
		super(white = new ImageIcon("src/images/d1_60x60_Knight2.png"));
	}
		
	public Knight(int color) {
		super(black = new ImageIcon("src/images/d1_60x60_Knight1.png"));
	}
}
