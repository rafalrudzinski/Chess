import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Knight extends JPanel {
	int player = -1;
    JPanel knight;
	JLabel knightLabel;
	ImageIcon knightIcon;
	
	/*
	 * Create Knight piece, constructor receives int representing player1 or
	 * player2 and creates piece with appropriate icon.
	 */
	Knight(int player) {
		this.player = player;
		if (this.player == 1) {
			knightIcon = new ImageIcon("images/d1_60x60_Knight1.png");
		}
		else if (this.player == 2) {
			knightIcon = new ImageIcon("images/d1_60x60_Knight2.png");
		}
		
		knightLabel = new JLabel(knightIcon);
		knightLabel.setSize(100, 100);
		knightLabel.setOpaque(false);
		knightLabel.setName("Knight");

	}

	/*
	 * create Kinght piece as JLabel with icon
	 */
	public void setKnight() {
		knightLabel = new JLabel(knightIcon);
		knightLabel.setSize(100, 100);
		knightLabel.setOpaque(false);
		knightLabel.setName("Knight");
	}

	/*
	 * return Knight piece as JLabel with icon 
	 */
	public JLabel getKnight(){
		return knightLabel;
	}
}