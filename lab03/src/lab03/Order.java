package lab03;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Order {
	static int counter = 0;
	Order(Pizza pizzas, Address address, Calendar o_time){
		this.pizzas = pizzas;
		this.address = address;
		this.orderID = counter;
		counter++;
		this.address = address;
		this.order_time = o_time;
		
	}
	private int orderID;
	private Pizza pizzas;
	private Address address;
	private Calendar order_time;
	private String status;
	private String deliverer;
	
	public String generate_file(){
		return address.delv_address() + " \r\n" + pizzas.getPrice() +" zl\r\nWykonawca :"+deliverer+ "\r\n";
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getDeliverer() {
		return deliverer;
	}
	public void setDelivererStatus(String deliverer,String status) {
		this.deliverer = deliverer;
		this.status = status;
	}
	//getters
	public int getOrderID() {
		return orderID;
	}
	public Pizza getPizzas() {
		return pizzas;
	}
	public Address getAddress() {
		return address;
	}
	public Calendar getOrder_time() {
		return order_time;
	}	
	
	

}
