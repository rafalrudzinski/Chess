import java.awt.*;
import javax.swing.*;

public class Chess {
	public static void main(String[] args) {
		ChessBoard frame = new ChessBoard();
		frame.setDefaultCloseOperation(1);
		frame.pack();
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}