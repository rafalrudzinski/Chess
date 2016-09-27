

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;





public class Rook extends JPanel{
	
	int player = -1;
	BufferedImage RookImg;
	JLabel theImage;
	JPanel rook;
	JButton rookJbt;
	ImageIcon rookIcon;

	
	Rook(int player) throws IOException{
		this.player = player;

		if (this.player == 1) {
			rookIcon = new ImageIcon("images/d1_60x60_Rook1.png");
		}
		else if (this.player == 2) {
			rookIcon = new ImageIcon("images/d1_60x60_Rook2.png");
		}
		
		rookJbt = new JButton(rookIcon);
		rookJbt.setSize(100, 100);
		rookJbt.setOpaque(false);
		rookJbt.setContentAreaFilled(false);
		rookJbt.setBorderPainted(false);

		
	}
	

	public void setRook() throws IOException{
	}
	
	public JButton getRook(){
		return rookJbt;
	}
	
}
