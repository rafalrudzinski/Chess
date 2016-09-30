import java.awt.*;
import javax.swing.*;

public class Pawn extends Piece {
	
	int color;
	static ImageIcon white; 
	static ImageIcon black;
	
	public Pawn() {
		super(white = new ImageIcon("src/images/d1_60x60_Pawn2.png"));
	}
	
	public Pawn(int color) {
		super(black = new ImageIcon("src/images/d1_60x60_Pawn1.png"));
	}
}

