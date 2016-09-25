import javax.swing.*;
import java.awt.*;

public class ChessBoard {

JFrame frame;
JPanel squares[][] = new JPanel[8][8];

public ChessBoard() {
    frame = new JFrame("Chess");
    frame.setSize(800, 800);
    frame.setLayout(new GridLayout(8, 8));

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            squares[i][j] = new JPanel();

            if ((i + j) % 2 == 0) {
                squares[i][j].setBackground(Color.black);
            } else {
                squares[i][j].setBackground(Color.white);
            }   
            frame.add(squares[i][j]);
        }
    }

    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

public static void main(String[] args) {
    new ChessBoard();
}
}
