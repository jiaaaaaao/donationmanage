package donationmanage;

import java.util.Scanner;

public class Entrypoint {

	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();
		Register register = new Register(warehouse);
		Distributor distributor = new Distributor(warehouse);		
		Reporter reporter = new Reporter(warehouse);

		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("wait for action\n");
				String line = scanner.nextLine();
				if (line.startsWith("register:")) {
					String[] info = line.split(":");
					if (info.length != 5) {
						System.out.printf("invalid input %s\n", line);
						continue;
					}

					String name = info[1];
					String type = info[2];
					int quantity = Integer.valueOf(info[3]);
					String date = info[4];
					register.add(name, type, quantity, date);
				} else if (line.startsWith("dispatch:")) {
					String[] info = line.split(":");
					if (info.length != 4) {
						System.out.printf("invalid input %s\n", line);
						continue;
					}

					String type = info[1];
					int quantity = Integer.valueOf(info[2]);
					String date = info[3];
					boolean success = distributor.dispatch(type, quantity, date);
					if(!success){
						System.out.println("not enough inventory");
					}
				} else if (line.startsWith("report:")) {
					String[] info = line.split(":");
					if (info.length != 2) {
						System.out.printf("invalid input %s\n", line);
						continue;
					}
					reporter.report(info[1]);								
				} else {
					System.out.printf("invalid input %s\n", line);
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
}
