package lab03;

public class Address {

	Address(String str, String nH, String c, String cmp){
		this.street = str;
		this.nHome = nH;
		this.city = c;
		this.company = cmp;
		
	}
	
	public String order_address(){
		return street + " " + nHome + " " + city;
	} 
	public String delv_address(){
		return street + " " + nHome + ", \r\n"  + city + ", \r\n" +company;
	} 
	private String street;
	private String nHome;
	private String city;
	private String company;
	
	
}
