import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Knight extends JPanel{
	int player = -1;
	BufferedImage KnightImg;
    JPanel knight;
	JLabel knightJbt;
	ImageIcon knightIcon;
	

	Knight(int player) throws IOException{
		this.player = player;
		if (this.player == 1) {
			knightIcon = new ImageIcon("images/d1_60x60_Knight1.png");
		}
		else if (this.player == 2) {
			knightIcon = new ImageIcon("images/d1_60x60_Knight2.png");
		}
		
		knightJbt = new JLabel(knightIcon);
		knightJbt.setSize(100, 100);
		knightJbt.setOpaque(false);

	}

	public void setKnight() throws IOException{
	}

	public JLabel getKnight(){
		return knightJbt;
	}
}
