package donationmanage;

import java.util.Map;

public class Reporter {
	Warehouse warehouse;

	public Reporter() {

	}

	public Reporter(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public void report(String reportType) {
		if (reportType.equals("inventory")) {
			Map<String, Item> items =warehouse.getItems();
			
			for(String type: items.keySet()) {
				System.out.printf("type:%s quantity:%d\n", type, items.get(type).quantity);
			}
		} else if (reportType.equals("donor")) {
			Map<String, Donor> donor = warehouse.getDonors();
			
			for(String name: donor.keySet()) {
				System.out.println("donor:" + name);
				donor.get(name).report();
			}
			
		} else {
			System.out.println("invalid report type " + reportType);
		}
	}

}
