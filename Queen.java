import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Queen extends JPanel{
	int player = -1;
	JPanel queen;
	JLabel queenLabel;
	ImageIcon queenIcon;

	/*
	 * Create Queen piece, constructor receives int representing player1 or
	 * player2 and creates piece with appropriate icon.
	 */
	Queen(int player) {
		this.player = player;
		if (this.player == 1) {
			queenIcon = new ImageIcon("images/d1_60x60_Queen1.png");
		}
		else if (this.player == 2) {
			queenIcon = new ImageIcon("images/d1_60x60_Queen2.png");
		}
		queenLabel = new JLabel(queenIcon);
		queenLabel.setSize(100, 100);
		queenLabel.setOpaque(false);
		queenLabel.setName("Queen");
	}

	/*
	 * create Queen piece as JLabel with icon
	 */
	public void setQueen() {
		queenLabel = new JLabel(queenIcon);
		queenLabel.setSize(100, 100);
		queenLabel.setOpaque(false);
		queenLabel.setName("Queen");
	}

	/*
	 * return Queen piece as JLabel with icon 
	 */
	public JLabel getQueen(){
		return queenLabel;
	}
}