import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Rook extends JPanel{

	int player = -1;
	BufferedImage RookImg;
	JPanel rook;
	JLabel rookJbt;

	ImageIcon rookIcon;

	Rook(int player) throws IOException{
		this.player = player;
		if (this.player == 1) {
			rookIcon = new ImageIcon("images/d1_60x60_Rook1.png");
		}
		else if (this.player == 2) {
			rookIcon = new ImageIcon("images/d1_60x60_Rook2.png");
		}

		rookJbt = new JLabel(rookIcon);
		rookJbt.setSize(100, 100);
		rookJbt.setOpaque(false);
		rookJbt.setName("Rook");

	}

	public void setRook() throws IOException{
	}

	public JLabel getRook(){
		return rookJbt;
	}
}
