package donationmanage;

public class Contribution {
	public String type;
	public int quantity;
	public String date;

	public Contribution(String type, int quantity, String date) {
		this.type = type;
		this.quantity = quantity;
		this.date = date;
	}
}
