import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Rook extends JPanel{

	int player = -1;
	JPanel rook;
	JLabel rookLabel;
	ImageIcon rookIcon;

	/*
	 * Create Rook piece, constructor receives int representing player1 or
	 * player2 and creates piece with appropriate icon.
	 */
	Rook(int player) {
		this.player = player;
		if (this.player == 1) {
			rookIcon = new ImageIcon("images/d1_60x60_Rook1.png");
		}
		else if (this.player == 2) {
			rookIcon = new ImageIcon("images/d1_60x60_Rook2.png");
		}

		rookLabel = new JLabel(rookIcon);
		rookLabel.setSize(100, 100);
		rookLabel.setOpaque(false);
		rookLabel.setName("Rook");

	}

	/*
	 * create Rook piece as JLabel with icon
	 */	
	public void setRook() {
		rookLabel = new JLabel(rookIcon);
		rookLabel.setSize(100, 100);
		rookLabel.setOpaque(false);
		rookLabel.setName("Rook");
	}

	/*
	 * return King piece as JLabel with icon 
	 */
	public JLabel getRook(){
		return rookLabel;
	}
}