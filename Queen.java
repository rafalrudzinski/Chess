

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;





public class Queen extends JPanel{
	
	int player = -1;
	BufferedImage queenImg;
	JLabel theImage;
	JPanel queen;
	JButton queenJbt;
	ImageIcon queenIcon;

	
	Queen(int player) throws IOException{
		this.player = player;

		if (this.player == 1) {
			queenIcon = new ImageIcon("images/d1_60x60_Queen1.png");
		}
		else if (this.player == 2) {
			queenIcon = new ImageIcon("images/d1_60x60_Queen2.png");
		}
		
		queenJbt = new JButton(queenIcon);
		queenJbt.setSize(100, 100);
		queenJbt.setOpaque(false);
		queenJbt.setContentAreaFilled(false);
		queenJbt.setBorderPainted(false);

		
	}
	

	public void setQueen() throws IOException{
	}
	
	public JButton getQueen(){
		return queenJbt;
	}
	
}
