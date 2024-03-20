package donationmanage;

public class Distributor {
	Warehouse warehouse;

	public Distributor() {

	}

	public Distributor(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public boolean dispatch(String type, int quantity, String date) {
		if (!warehouse.getItems().containsKey(type)) {
			return false;
		}

		Item item = warehouse.getItems().get(type);
		if (item.quantity < quantity) {
			System.out.println("not enough item");
			return false;
		}

		warehouse.getItems().put(type, item.deduction(quantity));
		warehouse.getDispatches().add(new Dispatch(type, quantity, date));

		return true;
	}

}
