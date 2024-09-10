package patientmanagementsystem;

public class PatientAppointment {
	private int patientID;
	private String patientName;
	private String appointmentTime;

	public PatientAppointment(int patientID, String patientName, String appointmentTime) {
		this.patientID = patientID;
		this.patientName = patientName;
		this.appointmentTime = appointmentTime;
	}

	// Getters and setters
	public int getPatientID() {
		return patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	// Override toString for displaying appointment details
	@Override
	public String toString() {
		return "Appointment: [Patient ID: " + patientID + ", Name: " + patientName + ", Time: " + appointmentTime + "]";
	}
}
