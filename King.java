import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class King extends JPanel{
	int player = -1;
	BufferedImage kingImg;
	JPanel king;
	JLabel kingJbt;
	ImageIcon kingIcon;
	

	King(int player) throws IOException{
		this.player = player;
		if (this.player == 1) {
			kingIcon = new ImageIcon("images/d1_60x60_King1.png");
		}
		else if (this.player == 2) {
			kingIcon = new ImageIcon("images/d1_60x60_King2.png");
		}

		kingJbt = new JLabel(kingIcon);
		kingJbt.setSize(100, 100);
		kingJbt.setOpaque(false);

	}

	public void setKing() throws IOException{
	}

	public JLabel getKing(){
		return kingJbt;
	}
	

}
