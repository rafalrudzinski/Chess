

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;





public class King extends JPanel{
	
	int player = -1;
	BufferedImage kingImg;
	JLabel theImage;
	JPanel king;
	JButton kingJbt;
	ImageIcon kingIcon;

	
	King(int player) throws IOException{
		this.player = player;

		if (this.player == 1) {
			kingIcon = new ImageIcon("images/d1_60x60_King1.png");
		}
		else if (this.player == 2) {
			kingIcon = new ImageIcon("images/d1_60x60_King2.png");
		}
		
		kingJbt = new JButton(kingIcon);
		kingJbt.setSize(100, 100);
		kingJbt.setOpaque(false);
		kingJbt.setContentAreaFilled(false);
		kingJbt.setBorderPainted(false);

		
	}
	

	public void setKing() throws IOException{
	}
	
	public JButton getKing(){
		return kingJbt;
	}
	
}
