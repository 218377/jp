package lab03;

public class Pizza {

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	private String[] types;
	private String type;
	private double price;
	private int quantity;
	
	public Pizza(int t_type, int amount){
		types[0] = "Diavolo";
		types[1] = "PeWueRka";
		types[2] = "akeW";
		types[3] = "avaJ";
		types[4] = "Gnusmas";

		type = types[t_type];
		switch (t_type) {
		case (0):
			price = 24 * amount;
		case (4):
			price = 23 * amount;
		case (1):
			price = 22 * amount;
		case (2):
			price = 28 * amount;
		case (3):
			price = 22.5 * amount;
		};
	}
		
}
