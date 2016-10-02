import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class King extends JPanel{
	int player = -1;
	JPanel king;
	JLabel kingLabel;
	ImageIcon kingIcon;
	
	/*
	 * Create King piece, constructor receives int representing player1 or
	 * player2 and creates piece with appropriate icon.
	 */
	King(int player) {
		this.player = player;
		if (this.player == 1) {
			kingIcon = new ImageIcon(Chess.class.getResource("/d1_60x60_King1.png"));
		}
		else if (this.player == 2) {
			kingIcon = new ImageIcon(Chess.class.getResource("/d1_60x60_King2.png"));
		}

		kingLabel = new JLabel(kingIcon);
		kingLabel.setSize(100, 100);
		kingLabel.setOpaque(false);
		kingLabel.setName("King");
	}
	
	/*
	 * create King piece as JLabel with icon
	 */	
	public void setKing() {
		kingLabel = new JLabel(kingIcon);
		kingLabel.setSize(100, 100);
		kingLabel.setOpaque(false);
		kingLabel.setName("King");
	}

	/*
	 * return King piece as JLabel with icon 
	 */
	public JLabel getKing(){
		return kingLabel;
	}
}