package donationmanage;

public class Item {
	public String type;
	public int quantity;

	public Item(String type, int quantity) {
		this.type = type;
		this.quantity = quantity;
	}

	public Item addition(Item newItem) {
		this.quantity += newItem.quantity;

		return this;
	}

	public Item deduction(int quantity) {
		this.quantity = this.quantity - quantity;
		return this;
	}
}
