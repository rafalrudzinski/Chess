import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class Pawn extends JPanel{
	int player = -1;
	JPanel pawn;
	JLabel pawnLabel;
	ImageIcon pawnIcon;
    int x,y;
        
    /*
	 * Create Pawn piece, constructor receives int representing player1 or
	 * player2 and creates piece with appropriate icon.
	 */  
	Pawn(int player, int x, int y) {
		this.player = player;
        this.x=x;
        this.y=y;

		if (this.player == 1) {
			pawnIcon = new ImageIcon(Chess.class.getResource("/d1_60x60_Pawn1.png"));
		}

		else if (this.player == 2) {
			pawnIcon = new ImageIcon(Chess.class.getResource("/d1_60x60_Pawn2.png"));
		}

		pawnLabel = new JLabel(pawnIcon);
		pawnLabel.setSize(100, 100);
		pawnLabel.setOpaque(false);
	    pawnLabel.setName("Pawn");
	}

	/*
	 * create Pawn piece as JLabel with icon
	 */
	public void setPawn() {
		pawnLabel = new JLabel(pawnIcon);
		pawnLabel.setSize(100, 100);
		pawnLabel.setOpaque(false);
	    pawnLabel.setName("Pawn");
	}
	
	/*
	 * return x-coordinate
	 */
    public int getX() {
    	return x;
    }
    
    /*
	 * return y-coordinate
	 */
    public int getY() {
    	return y;
    }
    
    /*
	 * set x-coordinate
	 */
    public void setX(int x) {
    	this.x=x;
    }
    
    /*
	 * set y-coordinate
	 */
	public void setY(int y) {
		this.y=y;
	}

	/*
	 * return Pawn piece as JLabel with icon 
	 */
	public JLabel getPawn(){
		return pawnLabel;
	}
}