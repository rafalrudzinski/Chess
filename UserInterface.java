import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


public class UserInterface extends JPanel implements MouseListener, MouseMotionListener{
	
	static int mouseX, mouseY, newMouseX, newMouseY;
	
	static int x = 0, y = 0;
	static int squareSize = 64;
	
	@Override
	public void paintComponent(Graphics g) {
		
		// Set entire background color to White.
		super.paintComponent(g);
		this.setBackground(Color.GRAY);
		
		// Add Mouse Listeners.
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		

        
        // White images.

        Image R = new ImageIcon("images/d1_60x60_Rook1.png").getImage();
        Image K = new ImageIcon("images/d1_60x60_Knight1.png").getImage();
        Image B = new ImageIcon("images/d1_60x60_Bishop1.png").getImage();
        Image Q = new ImageIcon("images/d1_60x60_Queen1.png").getImage();
        Image A = new ImageIcon("images/d1_60x60_King1.png").getImage();
        
        //Black images.

        Image r = new ImageIcon("images/d1_60x60_Rook2.png").getImage();
        Image k = new ImageIcon("images/d1_60x60_Knight2.png").getImage();
        Image b = new ImageIcon("images/d1_60x60_Bishop2.png").getImage();
        Image q = new ImageIcon("images/d1_60x60_Queen2.png").getImage();
        Image a = new ImageIcon("images/d1_60x60_King2.png").getImage();
        
        
        for (int i = 0; i < 8; i++){
        	for (int j = 0; j < 8; j++){
        		if ( (i+j)%2 == 0 ){
        			g.setColor(Color.WHITE);
        		}
        		else {
        			g.setColor(Color.BLUE);
        		}
        		g.fillRect(i*squareSize, j*squareSize, squareSize, squareSize);
        		
     		
        	}
            
        }

		for (int i = 0; i < 64; i++){
			if (Game.myBoard[i/8][i%8].equals("P")){
				g.drawImage(Pawn.getImage(1), (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("R")){
				g.drawImage(R, (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("K")){
				g.drawImage(K, (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("B")){
				g.drawImage(B, (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("Q")){
				g.drawImage(Q, (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("A")){
				g.drawImage(A, (i%8*squareSize), (i/8)*squareSize, this);
			}
			
			if (Game.myBoard[i/8][i%8].equals("p")){
				g.drawImage(Pawn.getImage(2), (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("r")){
				g.drawImage(r, (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("k")){
				g.drawImage(k, (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("b")){
				g.drawImage(b, (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("q")){
				g.drawImage(q, (i%8*squareSize), (i/8)*squareSize, this);
			}
			if (Game.myBoard[i/8][i%8].equals("a")){
				g.drawImage(a, (i%8*squareSize), (i/8)*squareSize, this);
			}
		}
        
		
		
		
		/*
		g.setColor(Color.BLUE);
		g.fillRect(x-20, y-20, 40, 40);
		g.setColor(Color.RED);
		g.fillRect(40, 20, 80, 50);
		g.drawString("TestString", x, y);
		
		Image pieces;
		pieces = new ImageIcon("images/Pieces.png").getImage();
		g.drawImage(pieces, x, 0, x+100, 100, x, 0, x+100, 100, this);
		*/
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e){
		x = e.getX();
		y = e.getY();
		repaint();
		
		// For Debugging:
		//System.out.println("mouseMoved, print getX: " + e.getX());
		//System.out.println("mouseMoved, print getY: " + e.getY());
	}
	
	@Override
	public void mousePressed(MouseEvent e){
		
		// Inside the board.
		if (e.getX() < 8*squareSize && e.getY() < 8*squareSize){
			mouseX = e.getX();
			mouseY = e.getY();
			repaint();
		}
		

	}
	@Override
    public void mouseReleased(MouseEvent e) {
        if (e.getX()<8*squareSize &&e.getY()<8*squareSize) {
            //if inside the board
            newMouseX=e.getX();
            newMouseY=e.getY();
            if (e.getButton()==MouseEvent.BUTTON1) {
                String dragMove;
                if (newMouseY/squareSize==0 && mouseY/squareSize==1 && "P".equals(Game.myBoard[mouseY/squareSize][mouseX/squareSize])) {
                    //pawn promotion
                    dragMove=""+mouseX/squareSize+newMouseX/squareSize+Game.myBoard[newMouseY/squareSize][newMouseX/squareSize]+"QP";
                } else {
                    //regular move
                    dragMove=""+mouseY/squareSize+mouseX/squareSize+newMouseY/squareSize+newMouseX/squareSize+Game.myBoard[newMouseY/squareSize][newMouseX/squareSize];
                }
                String userPosibilities=Game.possibleMoves();
                if (userPosibilities.replaceAll(dragMove, "").length()<userPosibilities.length()) {
                    //if valid move
                    //Game.makeMove(dragMove);
                }
            }
            repaint();
        }
    }
	
	
	@Override
	public void mouseClicked(MouseEvent e){
		x = e.getX();
		y = e.getY();
		repaint();
		//System.out.println("mouseClicked");  // For debugging.
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e){
		x = e.getX();
		y = e.getY();
		repaint();  // re-draw.
	}
	
	
	@Override
	public void mouseEntered(MouseEvent e){
		
	}
	
	
	@Override
	public void mouseExited(MouseEvent e){
		
	}
	
	
	
	
}
