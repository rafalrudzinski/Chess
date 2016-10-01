import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Queen extends JPanel{
	int player = -1;
	BufferedImage queenImg;
	JPanel queen;
	JLabel queenJbt;
	ImageIcon queenIcon;

	Queen(int player) throws IOException{
		this.player = player;
		if (this.player == 1) {
			queenIcon = new ImageIcon("images/d1_60x60_Queen1.png");
		}
		else if (this.player == 2) {
			queenIcon = new ImageIcon("images/d1_60x60_Queen2.png");
		}
		queenJbt = new JLabel(queenIcon);
		queenJbt.setSize(100, 100);
		queenJbt.setOpaque(false);
		queenJbt.setName("Queen");
	}


	public void setQueen() throws IOException{
	}

	public JLabel getQueen(){
		return queenJbt;
	}
}
