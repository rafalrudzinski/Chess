import javax.swing.ImageIcon;

public class Bishop extends Piece {
	int color;
	static ImageIcon white; 
	static ImageIcon black;
		
	public Bishop() {
		super(white = new ImageIcon("src/images/d1_60x60_Bishop1.png"));
	}
		
	public Bishop(int color) {
		super(black = new ImageIcon("src/images/d1_60x60_Bishop2.png"));
	}
}
