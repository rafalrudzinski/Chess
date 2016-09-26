import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pawn extends JPanel{
	BufferedImage black = ImageIO.read(new File("resources/black.png"));
	JLabel image = new JLabel(new ImageIcon(black));	
	JPanel pawn = new JPanel();
	
	
	
	public Pawn() throws IOException{
	pawn.setSize(64,64);	
		
		
	}
	public void setPawn() throws IOException{
		
	}


}
