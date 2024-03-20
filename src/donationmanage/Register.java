package donationmanage;

public class Register {
	Warehouse warehouse;

	public Register() {

	}

	public Register(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public void add(String name, String type, int quantity, String date) {
		if (!this.warehouse.getDonors().containsKey(name)) {
			this.warehouse.getDonors().put(name, new Donor(name));
		}

		Donor donor = this.warehouse.getDonors().get(name);
		Contribution newContribution = new Contribution(type, quantity, date);
		donor.addContribution(newContribution);

		if (!this.warehouse.getItems().containsKey(type)) {
			this.warehouse.getItems().put(type, new Item(type, quantity));
		} else {
			Item item = this.warehouse.getItems().get(type);
			item.addition(new Item(type, quantity));
			this.warehouse.getItems().put(type, item);
		}
	}
}
