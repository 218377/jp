package lab03;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class lab03 {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Window();
			}
		});
	}
}
