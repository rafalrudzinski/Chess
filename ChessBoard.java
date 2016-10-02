
/*
 * Title:  Chess Program
 * 
 * Revision:  1.0
 * Author:  Justin Bee, Rafal Rudzinski, Nick Okerberg
 * 
 * Description:  This program will display a chessboard on the screen with
 * Player 1 (white) pieces and Player 2 (black) pieces in the appropriate
 * squares to start with.  The players can drag and drop the chess pieces
 * and play a game of chess.   
 * 
 * Instructions:  Execute the .jar file to run the program.
 * This has been tested as working on Windows 10.  
 * 
 * Revision History:
 * Date			Ver		Author				Description
 * 2016/10/02	1.0		Nick,Rafal,Justin 	Initial Release.
 */


// Define imports for this class.
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;


public class ChessBoard extends JFrame implements MouseListener, MouseMotionListener {
  
  //Define global variables used.
  JLayeredPane pane;	// Create a new JLayeredPane for the screen.
  JPanel board;			// Create a new JPanel.
  JLabel piece;			// The pieces will be JLabel's. 
  int xAdj;		// X value for mouse events.
  int yAdj;		// Y value for mouse events.
  int prevX;	// The source Y value.
  int prevY;	// The source X value.
  int turn=1;	// Keep track of the turns.
   
  
  /*
   * Define the Chessboard() method. This method adds the chessboard
   * to a Layered Pane.  Piece objects are then created for each
   * of the two players.  
   */
  public ChessBoard() throws IOException{
	 final Dimension boardSize = new Dimension(600, 600);
 
	 // Create a layered pane for the board (Default_layer). 
	 // When pieces are dragged, they are added to the drag layer.
	 pane = new JLayeredPane();
	 getContentPane().add(pane);
	 pane.setPreferredSize(boardSize);
	 pane.addMouseListener(this);
	 pane.addMouseMotionListener(this);
  
	 //Add a chess board to the Layered Pane 
	 board = new JPanel();
	 pane.add(board, JLayeredPane.DEFAULT_LAYER);
	 board.setLayout( new GridLayout(8, 8) );
	 board.setPreferredSize( boardSize );
	 board.setBounds(0, 0, boardSize.width, boardSize.height);
  
	 // Create the chessboard, alternating Maroon and Yellow colors.
	 for (int i = 0; i < 64; i++) {
		 JPanel box = new JPanel( new BorderLayout() );
		 board.add(box);
		 int row = (i / 8) % 2;
		 if (row == 0)
			 box.setBackground( i % 2 == 0 ? new Color(128,0,0) : Color.YELLOW);
		 else
			 box.setBackground( i % 2 == 0 ? Color.YELLOW : new Color(128,0,0));
	 } // End for loop.
	 
	 // Create the individual piece objects for Player 1 to start the game.
	 Pawn p1pawn1 = new Pawn(1,6,0);
	 Pawn p1pawn2 = new Pawn(1,6,1);
	 Pawn p1pawn3 = new Pawn(1,6,2);
	 Pawn p1pawn4 = new Pawn(1,6,3);
	 Pawn p1pawn5 = new Pawn(1,6,4);
	 Pawn p1pawn6 = new Pawn(1,6,5);
	 Pawn p1pawn7 = new Pawn(1,6,6);
	 Pawn p1pawn8 = new Pawn(1,6,7);
	 Rook p1rook1 = new Rook(1);
	 Rook p1rook2 = new Rook(1);
	 Knight p1knight1 = new Knight(1);
	 Knight p1knight2 = new Knight(1);
	 Bishop p1bishop1 = new Bishop(1);
	 Bishop p1bishop2 = new Bishop(1);
	 Queen p1queen = new Queen(1);
	 King p1king = new King(1);
	 
	 // Create the individual piece objects for Player 2 to start the game.
	 Pawn p2pawn1 = new Pawn(2,1,0);
	 Pawn p2pawn2 = new Pawn(2,1,1);
	 Pawn p2pawn3 = new Pawn(2,1,2);
	 Pawn p2pawn4 = new Pawn(2,1,3);
	 Pawn p2pawn5 = new Pawn(2,1,4);
	 Pawn p2pawn6 = new Pawn(2,1,5);
	 Pawn p2pawn7 = new Pawn(2,1,6);
	 Pawn p2pawn8 = new Pawn(2,1,7);
	 Queen p2queen = new Queen(2);
	 King p2king = new King(2);
	 Rook p2rook1 = new Rook(2);
	 Rook p2rook2 = new Rook(2);
	 Knight p2knight1 = new Knight(2);
	 Knight p2knight2 = new Knight(2);
	 Bishop p2bishop1 = new Bishop(2);
	 Bishop p2bishop2 = new Bishop(2);
	 
	 // Add Player 2 pieces onto the board. 
	 JPanel panel = (JPanel)board.getComponent(0);
	 panel.add(p2rook1.getRook());
	 panel = (JPanel)board.getComponent(1);
	 panel.add(p2knight1.getKnight());
	 panel = (JPanel)board.getComponent(2);
	 panel.add(p2bishop1.getBishop());
	 panel = (JPanel)board.getComponent(3);
	 panel.add(p2queen.getQueen());
	 panel = (JPanel)board.getComponent(4);
	 panel.add(p2king.getKing());
	 panel = (JPanel)board.getComponent(5);
	 panel.add(p2bishop2.getBishop());
	 panel = (JPanel)board.getComponent(6);
	 panel.add(p2knight2.getKnight());
	 panel = (JPanel)board.getComponent(7);
	 panel.add(p2rook2.getRook());
	 panel = (JPanel)board.getComponent(8);
	 panel.add(p2pawn1.getPawn());
	 panel = (JPanel)board.getComponent(9);
	 panel.add(p2pawn2.getPawn());
	 panel = (JPanel)board.getComponent(10);
	 panel.add(p2pawn3.getPawn());
	 panel = (JPanel)board.getComponent(11);
	 panel.add(p2pawn4.getPawn());
	 panel = (JPanel)board.getComponent(12);
	 panel.add(p2pawn5.getPawn());
	 panel = (JPanel)board.getComponent(13);
	 panel.add(p2pawn6.getPawn());
	 panel = (JPanel)board.getComponent(14);
	 panel.add(p2pawn7.getPawn());
	 panel = (JPanel)board.getComponent(15);
	 panel.add(p2pawn8.getPawn());
	 
	 // Add the Player 1 pieces onto the board.
	 panel = (JPanel)board.getComponent(56);
	 panel.add(p1rook1.getRook());
	 panel = (JPanel)board.getComponent(57);
	 panel.add(p1knight1.getKnight());
	 panel = (JPanel)board.getComponent(58);
	 panel.add(p1bishop1.getBishop());
	 panel = (JPanel)board.getComponent(59);
	 panel.add(p1queen.getQueen());
	 panel = (JPanel)board.getComponent(60);
	 panel.add(p1king.getKing());
	 panel = (JPanel)board.getComponent(61);
	 panel.add(p1bishop2.getBishop());
	 panel = (JPanel)board.getComponent(62);
	 panel.add(p1knight2.getKnight());
	 panel = (JPanel)board.getComponent(63);
	 panel.add(p1rook2.getRook());
	 panel = (JPanel)board.getComponent(48);
	 panel.add(p1pawn1.getPawn());
	 panel = (JPanel)board.getComponent(49);
	 panel.add(p1pawn2.getPawn());
	 panel = (JPanel)board.getComponent(50);
	 panel.add(p1pawn3.getPawn());
	 panel = (JPanel)board.getComponent(51);
	 panel.add(p1pawn4.getPawn());
	 panel = (JPanel)board.getComponent(52);
	 panel.add(p1pawn5.getPawn());
	 panel = (JPanel)board.getComponent(53);
	 panel.add(p1pawn6.getPawn());
	 panel = (JPanel)board.getComponent(54);
	 panel.add(p1pawn7.getPawn());
	 panel = (JPanel)board.getComponent(55);
	 panel.add(p1pawn8.getPawn());
  } // End the chessboard() method.
 
  
  
  
  /*
   * Method to keep track of the player's turns
   */
  public int playerTurn(){
	  if (turn==1){
		  turn=2;
	  }
	  else if(turn==2){
		  turn=1;
	  }
	  return turn;
  } // End method.
  
  
  
  
  /*
   * Method that determines whether a move is valid or not. 
   * The method takes in the old x value, old y value, the
   * proposed new x value, the proposed new y value, and a
   * string name of the piece. It then determines if the move
   * is valid or not. It returns a boolean result.
   * Note: All of the piece validations are not yet implemented.
   */
  public boolean isValidMove(int oldx, int oldy, int newx, int newy, String name) {
	  boolean move = false;
	  Component a = board.getComponentAt(oldx, oldy);
	  Component b = board.getComponentAt(newx, newy);
	  Point p = a.getLocation();	  
	  Point q = b.getLocation();
	  
	  /*
	   * Check the Pawn piece for valid moves.
	   * Note: The Pawn validation is not completely implemented.
	   */
	  if (name.equals("Pawn")){
		  if(p.getX()== q.getX()){
			  if(p.getY()-q.getY()==75){
				  move = true;
			  }
			  else if(q.getY()-p.getY()==75){
				  move = true;
			  }
		  }
		  else{
			  move = true; // Change to false once Pawn's validation is fully implemented.
		  }
	  }
	  
	  /*
	   * Check the Rook piece for valid moves.
	   */
	  else if(name.equals("Rook")){
		  if(p.getX()==q.getX()){
			  move=true;
		  }
		  else if(p.getY()==q.getY()){
			  move=true;
		  }
		  else{
			  move=false; 
		  }
	  }
	  
	  /*
	   * Check the Knight piece for valid moves.
	   * Note: The Knight moves validation is not yet fully implemented.
	   */
	  else if(name.equals("Knight")){
		  if(p.getX()+q.getX()==150 && p.getY()+q.getY()==75){
			  move = true;
		  }
		  else if(p.getX()+q.getX()==150 && p.getY()-q.getY()==75){
			  move = true;
		  }
		  else if(p.getX()+q.getX()==75 && p.getY()-q.getY()==150){
			  move=true;
		  }
		  else if(p.getX()+q.getX()==75 && p.getY()+q.getY()==150){
			  move = true;
	      }
		  else if(p.getX()-q.getX()==150 && p.getY()+q.getY()==75){
			  move = true;
		  }
		  else if(p.getX()-q.getX()==150 && p.getY()-q.getY()==75){
			  move=true;
		  }
		  else if(p.getX()-q.getX()==75 && p.getY()-q.getY()==150){
			  move = true;
	      }
		  else if(p.getX()-q.getX()==75 && p.getY()+q.getY()==150){
			  move = true;
	      }
		  else{
			  move=true; // Change to false, once Knight's move validations are implemented.
		  }
	  }
	  
	  /*
	   * Check for valid moves for the bishop.
	   */
	  else if(name.equals("Bishop")){
		  if(p.getX()==q.getX()){
			  move=false;
		  }
		  else if(p.getY()==q.getY()){
			  move = false;
		  }
		  else{
			  move=true;
		  }
	  }
	  
	  /*
	   * Check for valid moves for the King.
	   * Note: The King's move validations are not fully implemented.
	   */
	  else if(name.equals("King")){
		  if(p.getX()+q.getX()==75&& p.getY()==q.getY()){
			  move=true;
		  }
		  else if(p.getX()-q.getX()==75 && p.getY() == q.getY()){
			  move=true;
		  }
		  else if(p.getX()==q.getX() && p.getY()+q.getY()==75){
			  move=true;
		  }
		  else if(p.getX()==q.getX() && p.getY()-q.getY()==75){
			  move=true;
		  }
		  else{
			move=true;  // Change to false when King's move validations are fully implemented.
		  }
	  }
	  
	  /*
	   * Check for valid moves for the queen.
	   * Note: The Queen's move validations are not yet implemented.
	   */
	  else if(name.equals("Queen")){
		  move = true;
	  }
	  
	  /*
	   * If there's no match for the piece, take the default action and
	   * set the move boolean to false.
	   */
	  else{
		  move=false;
	  }
	  
	  // Return the boolean result
	  return move;
  } // End the Move validation method.
  
  
  
  
 /*
  * Define mousePressed method. Actions to take when the mouse
  * button is pressed.  Get the piece at the location of the press.
  */
  public void mousePressed(MouseEvent e){
	  piece = null; 
	  Component c =  board.findComponentAt(e.getX(), e.getY());
	  prevX=e.getX();
	  prevY=e.getY();
	  if (c instanceof JPanel) 
		  return;
	  Point parentLocation = c.getParent().getLocation();
	  xAdj = parentLocation.x - e.getX();
	  yAdj = parentLocation.y - e.getY();
	  piece = (JLabel)c;
	  piece.setLocation(e.getX() + xAdj, e.getY() + yAdj);
	  piece.setSize(piece.getWidth(), piece.getHeight());
	  pane.add(piece, JLayeredPane.DRAG_LAYER);
  } // End mousePressed method.
 
  
  
  
  /*
   * Define the mouseDragged method.  Drag the chess
   * piece around the board.
   */
  public void mouseDragged(MouseEvent me) {
	  if (piece == null) return;
	  piece.setLocation(me.getX() + xAdj, me.getY() + yAdj);
  } // End mouseDragged method.
 
  
  
  
  /*
   * Define the mouseReleased method. Get the position of where
   * the mouse is released at.  Then call isValidMove() to determine
   * if there is a valid move at that release point.  If the move
   * is valid, then drop the piece at the new location, otherwise
   * return it to the previous location.  
   */
  public void mouseReleased(MouseEvent e) {
	  
	  if(piece== null){
		  return;
	  }
	  else if(board == null){

	      piece.setVisible(false);
	      Component c =  board.findComponentAt(prevX, prevY);

	      if (c instanceof JLabel){
	      Container parent = c.getParent();
	      parent.remove(0);
	      parent.add( piece );
	      }
	      else {
	      Container parent = (Container)c;
	      parent.add( piece );
	      }
	  }
	  
	  else if(isValidMove(prevX, prevY, e.getX(), e.getY(), piece.getName())){  
		  if(piece == null) return;
 
		  piece.setVisible(false);
		  Component c =  board.findComponentAt(e.getX(), e.getY());
 
		  if (c instanceof JLabel){
			  Container parent = c.getParent();
			  parent.remove(0);
			  parent.add( piece );
		  }
		  else {
			  Container parent = (Container)c;
			  parent.add( piece );
		  }
		  playerTurn();
	  } 
	    
	  // Return piece to original location
	  else if(!isValidMove(prevX, prevY, e.getX(), e.getY(), piece.getName())){
		  if(piece == null) return;
		  piece.setVisible(false);
		  Component c =  board.findComponentAt(prevX, prevY);

		  if (c instanceof JLabel){
			  Container parent = c.getParent();
			  parent.remove(0);
			  parent.add( piece );
		  }
		  else {
			  Container parent = (Container)c;
			  parent.add( piece );
		  }
      
	  }
	  else{
	  }
	  piece.setVisible(true);
  } // End mouseReleased method.
 
  
  
  /*
   * The remaining mouse event methods are declared below,
   * but are not currently used.  
   */
  public void mouseClicked(MouseEvent e) {
  }
  public void mouseMoved(MouseEvent e) {
  }
  public void mouseEntered(MouseEvent e){
  }
  public void mouseExited(MouseEvent e) {
  } 
  
} // End chessBoard class.

