package lab03;
import javax.swing.JFrame;

public class Window extends JFrame {

	public Window(){
		super ("Pizza admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
		setResizable(false);
	}
	
}
