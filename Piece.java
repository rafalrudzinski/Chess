import java.awt.*;
import javax.swing.*;

public abstract class Piece extends JLabel {
	
	ImageIcon image;
	
	Piece(ImageIcon image) {
		super(image);
	}
}
