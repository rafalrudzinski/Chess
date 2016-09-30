import java.awt.*;

import javax.swing.*;

public class Square extends JPanel {
	private int id;
	
	Square(int id) {
		this.id = id;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	int getId() {
		return id;
	}
}
