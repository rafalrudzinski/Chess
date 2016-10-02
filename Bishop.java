import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Bishop extends JPanel{
	int player = -1;
	JPanel bishop;
	JLabel bishopLabel;
	ImageIcon bishopIcon;

	/*
	 * Create Bishop piece, constructor receives int representing player1 or
	 * player2 and creates piece with appropriate icon.
	 */
	Bishop(int player) {
		this.player = player;
		if (this.player == 1) {
			bishopIcon = new ImageIcon(Chess.class.getResource("/d1_60x60_Bishop1.png"));
		}
		else if (this.player == 2) {
			bishopIcon = new ImageIcon(Chess.class.getResource("/d1_60x60_Bishop2.png"));
		}

		bishopLabel = new JLabel(bishopIcon);
		bishopLabel.setSize(100, 100);
		bishopLabel.setOpaque(false);
		bishopLabel.setName("Bishop");
	}

	/*
	 * create Bishop piece as JLabel with icon
	 */
	public void setBishop() {
		bishopLabel = new JLabel(bishopIcon);
		bishopLabel.setSize(100, 100);
		bishopLabel.setOpaque(false);
		bishopLabel.setName("Bishop");
	}
	
	/*
	 * return Bishop piece as JLabel with icon 
	 */
	public JLabel getBishop(){
		return bishopLabel;
	}
}