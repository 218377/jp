package lab03;

public class Pizza {

	

	//private static String[] types;
	private int type;
	private double price;
	public double getPrice() {
		return price;
	}
	private int quantity;
	
	public String get_infos(){
		
		return type+ " x"+quantity ;
		
	}
	public Pizza(int t_type, int amount){
		
		this.quantity = amount;
		this.type = t_type;
		switch (t_type) {
		case (0):
			this.price = 24 * amount;
		case (4):
			this.price = 23 * amount;
		case (1):
			this.price = 22 * amount;
		case (2):
			this.price = 28 * amount;
		case (3):
			this.price = 22.5 * amount;
		};
	}
		
}
