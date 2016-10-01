import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Bishop extends JPanel{
	int player = -1;
	BufferedImage BishopImg;
	JPanel bishop;
	JLabel bishopJbt;
	ImageIcon bishopIcon;


	Bishop(int player) throws IOException{
		this.player = player;
		if (this.player == 1) {
			bishopIcon = new ImageIcon("images/d1_60x60_Bishop1.png");
		}
		else if (this.player == 2) {
			bishopIcon = new ImageIcon("images/d1_60x60_Bishop2.png");
		}

		bishopJbt = new JLabel(bishopIcon);
		bishopJbt.setSize(100, 100);
		bishopJbt.setOpaque(false);
		bishopJbt.setName("Bishop");
	}

	public void setBishop() throws IOException{
	}
	public JLabel getBishop(){
		return bishopJbt;
	}
}
