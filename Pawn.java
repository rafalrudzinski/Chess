

import java.awt.Image;

import javax.swing.ImageIcon;


public class Pawn {
	
	Image pawnImage;
	int playerNumber = 0; // 1 for white, 2 for black.
	
	// Get White Pawn image.
	static Image P = new ImageIcon("images/d1_60x60_Pawn1.png").getImage();
	
	// Get Black Pawn image.
	static Image p = new ImageIcon("images/d1_60x60_Pawn2.png").getImage();
	

	// Pawn constructor.
	Pawn(int playerNumber){
		this.playerNumber = playerNumber;
		
		if (this.playerNumber == 1){
			pawnImage = P; // white pawn
		}else{
			pawnImage = p; // black pawn
		}
	}
	
	
	/*
	public Image getImage(){
		return pawnImage;
	}
	*/
	
	public int getPlayerNumber(){
		return playerNumber;
	}
	
	public static Image getImage(int i){
		if (i == 1){
			return P;
		}else{
			return p; // black pawn
		}
	}
	
}
