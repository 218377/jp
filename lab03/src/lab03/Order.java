package lab03;

import java.util.ArrayList;
import java.util.List;

public class Order {

	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public double getValue() {
		return value;
	}
	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}
	public void setPizzas(ArrayList<Pizza> pizzas) {
		this.pizzas = pizzas;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	private int orderID;
	private ArrayList<Pizza> pizzas;
	private Address address;
	
	private double value;
	

}
