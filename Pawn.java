

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;





public class Pawn extends JPanel{
	
	int player = -1;
	BufferedImage pawnImg;
	JLabel theImage;
	JPanel pawn;
	JButton pawnJbt;
	ImageIcon pawnIcon;
    ListenerClass regListener = new ListenerClass();
	
	Pawn(int player) throws IOException{
		this.player = player;

		if (this.player == 1) {
			pawnIcon = new ImageIcon("images/d1_60x60_Pawn1.png");
		}
		else if (this.player == 2) {
			pawnIcon = new ImageIcon("images/d1_60x60_Pawn2.png");
		}
		
		//JLabel theImage = new JLabel(new ImageIcon(pawnImg));
		//JPanel pawn = new JPanel();
		//pawn.setSize(100,100);
		pawnJbt = new JButton(pawnIcon);
		pawnJbt.setSize(100, 100);
		pawnJbt.setOpaque(false);
		pawnJbt.setContentAreaFilled(false);
		pawnJbt.setBorderPainted(false);
		
		pawnJbt.addActionListener(regListener);  // Register a listener for this button.
		
	}
	

	public void setPawn() throws IOException{
	}
	
	public JButton getPawn(){
		return pawnJbt;
	}
	
	
}
