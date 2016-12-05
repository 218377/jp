package lab03;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Order {
	static int counter = 0;
	Order(Pizza pizzas, Address address, Calendar o_time){
		this.address = address;
		this.orderID = counter;
		counter++;
		this.address = address;
		this.order_time = o_time;
		
	}
	private int orderID;
	private Pizza pizzas;
	private Address address;
	private static Calendar order_time;
	
	private double value;
	

}
