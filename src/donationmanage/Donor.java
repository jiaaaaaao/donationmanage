package donationmanage;

import java.util.*;

public class Donor {
	public String name;
	public List<Contribution> contributions;

	public Donor(String name) {
		this.name = name;
		this.contributions = new ArrayList<>();
	}

	public void addContribution(Contribution newContribution) {
		contributions.add(newContribution);
	}

	public void report() {
		for (Contribution c : contributions) {
			System.out.printf("type:%s, quantity:%d, date:%s\n", c.type, c.quantity, c.date);
		}
	}
}
