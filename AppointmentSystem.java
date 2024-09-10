package patientmanagementsystem;

import java.util.Scanner;

//main method

public class AppointmentSystem {
	public static void main(String[] args) {
		AppointmentBST bst = new AppointmentBST();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n1. Schedule Appointment");
			System.out.println("2. Search Appointment");
			System.out.println("3. Cancel Appointment");
			System.out.println("4. View Appointments");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter patient ID: ");
				int patientID = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter patient name: ");
				String patientName = scanner.nextLine();
				System.out.print("Enter appointment time: ");
				String appointmentTime = scanner.nextLine();
				bst.addAppointment(new PatientAppointment(patientID, patientName, appointmentTime));
				System.out.println("Appointment scheduled successfully!");
				break;
			case 2:
				System.out.print("Enter appointment time to search: ");
				String searchTime = scanner.nextLine();
				PatientAppointment searchedAppointment = bst.searchByTime(searchTime);
				if (searchedAppointment != null) {
					System.out.println("Appointment found:");
					System.out.println(searchedAppointment);
				} else {
					System.out.println("Appointment not found.");
				}
				break;
			case 3:
				System.out.print("Enter appointment time to cancel: ");
				String cancelTime = scanner.nextLine();
				bst.cancelAppointment(cancelTime);
				System.out.println("Appointment cancelled successfully!");
				break;
			case 4:
				System.out.println("All Appointments:");
				bst.printAppointmentsInOrder(bst.getRoot());
				break;
			case 5:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

}
