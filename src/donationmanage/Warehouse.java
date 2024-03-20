package donationmanage;

import java.util.*;
import java.util.List;
import java.util.Map;

public class Warehouse {
	private Map<String, Donor> donors = new HashMap<>();
	private Map<String, Item> items = new HashMap<>();
	private List<Dispatch> dispatches = new ArrayList<>();
	
	public Map<String, Donor> getDonors() {
		return donors;
	}
	public void setDonors(Map<String, Donor> donors) {
		this.donors = donors;
	}
	public Map<String, Item> getItems() {
		return items;
	}
	public List<Dispatch> getDispatches() {
		return dispatches;		
	}

}
