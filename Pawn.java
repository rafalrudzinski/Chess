import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;



public class Pawn extends JPanel{
	int player = -1;
	BufferedImage pawnImg;
	JPanel pawn;
	JButton pawnJbt;
	ImageIcon pawnIcon;
    ListenerClass regListener = new ListenerClass();
    int x,y;

	Pawn(int player, int x, int y) throws IOException{

		this.player = player;
        this.x=x;
        this.y=y;


		if (this.player == 1) {
			pawnIcon = new ImageIcon("images/d1_60x60_Pawn1.png");
		}

		else if (this.player == 2) {
			pawnIcon = new ImageIcon("images/d1_60x60_Pawn2.png");
		}

		//JPanel pawn = new JPanel();
		//pawn.setSize(100,100);

		pawnJbt = new JButton(pawnIcon);
		pawnJbt.setSize(100, 100);
		pawnJbt.setOpaque(false);
		pawnJbt.setContentAreaFilled(false);
		pawnJbt.setBorderPainted(false);
		pawnJbt.addActionListener(regListener);  // Register a listener for this button.

		

	}

	



	public void setPawn() throws IOException{

	}
    public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }
    public void setX(int x){
    	this.x=x;
    }
	public void setY(int y){
		this.y=y;
	}

	public JButton getPawn(){
		return pawnJbt;
	}

	

	

}
