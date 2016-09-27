

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;





public class Bishop extends JPanel{
	
	int player = -1;
	BufferedImage BishopImg;
	JLabel theImage;
	JPanel bishop;
	JButton bishopJbt;
	ImageIcon bishopIcon;

	
	Bishop(int player) throws IOException{
		this.player = player;

		if (this.player == 1) {
			bishopIcon = new ImageIcon("images/d1_60x60_Bishop1.png");
		}
		else if (this.player == 2) {
			bishopIcon = new ImageIcon("images/d1_60x60_Bishop2.png");
		}
		
		bishopJbt = new JButton(bishopIcon);
		bishopJbt.setSize(100, 100);
		bishopJbt.setOpaque(false);
		bishopJbt.setContentAreaFilled(false);
		bishopJbt.setBorderPainted(false);

		
	}
	

	public void setBishop() throws IOException{
	}
	
	public JButton getBishop(){
		return bishopJbt;
	}
	
}
