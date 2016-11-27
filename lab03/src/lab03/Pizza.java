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
	private int quantity;
	
	public Pizza(){
		types[0] = "Diavolo";
		types[1] = "PeWueRka";
		types[2] = "akeW";
		types[3] = "avaJ";
		types[4] = "Gnusmas";
	}
		
}
