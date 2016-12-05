package lab03;

import java.util.Calendar;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class lab03 {
	static Calendar curr_t;
	static Calendar curr_t2;
		
	public static void main(String[] args) {
		curr_t = Calendar.getInstance();
		curr_t.set(Calendar.HOUR_OF_DAY, 10);
		curr_t.set(Calendar.MINUTE, 00);
		curr_t.set(Calendar.SECOND, 0);
		
		curr_t2 = Calendar.getInstance();
		curr_t2.set(Calendar.HOUR_OF_DAY, 10);
		curr_t2.set(Calendar.MINUTE, 00);
		curr_t2.set(Calendar.SECOND, 00);
		
		
		System.out.println();
		curr_t.set(Calendar.MINUTE, (curr_t.get(Calendar.MINUTE)+30));
		System.out.println(curr_t.getTime());
		curr_t.set(Calendar.MINUTE, (curr_t.get(Calendar.MINUTE)+30));
		System.out.println(curr_t.getTime());
		System.out.println(curr_t.compareTo(curr_t2));
		
	}
}
