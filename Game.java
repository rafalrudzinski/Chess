
import java.awt.*;
import javax.swing.*;


public class Game {
	
	

	static String myBoard[][]={
        {"r","k","b","q","a","b","k","r"},
        {"p","p","p","p","p","p","p","p"},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {"P","P","P","P","P","P","P","P"},
        {"R","K","B","Q","A","B","K","R"}};
	
	static int kingPositionC, kingPositionL;
	static int globalDepth=4;
	
	public static void main(String[] args) {
		
				
		
		JFrame f = new JFrame("Chess Game v1.0");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UserInterface ui = new UserInterface();
		f.add(ui);
		f.setSize(800, 800);
		f.setVisible(true);
		

		
		System.out.println(possibleMoves());
		
		/*
        makeMove(Game(globalDepth, 1000000, -1000000, "", 0));
        makeMove("7655 ");
        undoMove("7655 ");
        for (int i=0;i<8;i++) {
            System.out.println(Arrays.toString(myBoard[i]));
        }
        */
        
	} // End Main.

	
	
	public static String possibleMoves(){
		String list = "";
		
		for (int i = 0; i < 64; i++){
				if (myBoard[i/8][i%8].equals("P")){
					list += possibleP(i);
				}
				else if (myBoard[i/8][i%8].equals("R")){
					list += possibleR(i);
				}
				else if (myBoard[i/8][i%8].equals("K")){
					list += possibleK(i);
				}
				else if (myBoard[i/8][i%8].equals("B")){
					list += possibleB(i);
				}
				else if (myBoard[i/8][i%8].equals("Q")){
					list += possibleQ(i);
				}
				else if (myBoard[i/8][i%8].equals("A")){
					list += possibleA(i);
				}
			
		}
		
			
			

		return list; // x1,y1,x2,y2,captured piece
	}
	
	
	public static String possibleP(int i){
		String list = "";
		return list;
	}
	
	public static String possibleR(int i){
		String list = "";
		return list;
	}
	
	public static String possibleK(int i){
		String list = "";
		return list;
	}
	
	public static String possibleB(int i){
		String list = "";
		return list;
	}
	
	
	
	
	
    public static String possibleQ(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        int temp=1;
        for (int j=-1; j<=1; j++) {
            for (int k=-1; k<=1; k++) {
                try {
                    while(" ".equals(myBoard[r+temp*j][c+temp*k]))
                    {
                        oldPiece=myBoard[r+temp*j][c+temp*k];
                        myBoard[r][c]=" ";
                        myBoard[r+temp*j][c+temp*k]="Q";
                        if (kingSafe()) {
                            list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                        }
                        myBoard[r][c]="Q";
                        myBoard[r+temp*j][c+temp*k]=oldPiece;
                        temp++;
                    }
                    if (Character.isLowerCase(myBoard[r+temp*j][c+temp*k].charAt(0))) {
                        oldPiece=myBoard[r+temp*j][c+temp*k];
                        myBoard[r][c]=" ";
                        myBoard[r+temp*j][c+temp*k]="Q";
                        if (kingSafe()) {
                            list=list+r+c+(r+temp*j)+(c+temp*k)+oldPiece;
                        }
                        myBoard[r][c]="Q";
                        myBoard[r+temp*j][c+temp*k]=oldPiece;
                    }
                } catch (Exception e) {}
                temp=1;
            }
        }
        return list;
    }
		
	
	
	
    public static String possibleA(int i) {
        String list="", oldPiece;
        int r=i/8, c=i%8;
        for (int j=0; j<9; j++) {
            if (j!=4) {
                try {
                    if (Character.isLowerCase(myBoard[r-1+j/3][c-1+j%3].charAt(0)) || " ".equals(myBoard[r-1+j/3][c-1+j%3])) {
                        oldPiece=myBoard[r-1+j/3][c-1+j%3];
                        myBoard[r][c]=" ";
                        myBoard[r-1+j/3][c-1+j%3]="A";
                        int kingTemp=kingPositionC;
                        kingPositionC=i+(j/3)*8+j%3-9;
                        if (kingSafe()) {
                            list=list+r+c+(r-1+j/3)+(c-1+j%3)+oldPiece;
                        }
                        myBoard[r][c]="A";
                        myBoard[r-1+j/3][c-1+j%3]=oldPiece;
                        kingPositionC=kingTemp;
                    }
                } catch (Exception e) {}
            }
        }
        //need to add casting later
        return list;
    }
	
	
	public static boolean kingSafe(){
		return true;
	}
	
}// End Game class.
