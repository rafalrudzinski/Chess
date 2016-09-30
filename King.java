import javax.swing.ImageIcon;

public class King extends Piece {
	int color;
	static ImageIcon white; 
	static ImageIcon black;
		
	public King() {
		super(white = new ImageIcon("src/images/d1_60x60_King1.png"));
	}
		
	public King(int color) {
		super(black = new ImageIcon("src/images/d1_60x60_King2.png"));
	}
}
