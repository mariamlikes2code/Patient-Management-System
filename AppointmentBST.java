package patientmanagementsystem;

public class AppointmentBST {
	private AppointmentNode root;

	public AppointmentBST() {
		root = null;
	}

	public void addAppointment(PatientAppointment appointment) {
		root = insertRec(root, appointment);
	}

	private AppointmentNode insertRec(AppointmentNode root, PatientAppointment appointment) {
		if (root == null) {
			return new AppointmentNode(appointment);
		}

		// Compare appointment times to determine the insertion position
		if (appointment.getAppointmentTime().compareTo(root.getData().getAppointmentTime()) < 0) {
			root.setLeft(insertRec(root.getLeft(), appointment));
		} else if (appointment.getAppointmentTime().compareTo(root.getData().getAppointmentTime()) > 0) {
			root.setRight(insertRec(root.getRight(), appointment));
		}

		return root;
	}

	public AppointmentNode getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	public PatientAppointment searchByTime(String searchTime) {
		// TODO Auto-generated method stub
		return null;
	}

	public void cancelAppointment(String cancelTime) {
		// TODO Auto-generated method stub
		
	}

	public void printAppointmentsInOrder(AppointmentNode root2) {
		// TODO Auto-generated method stub
		
	}
	
	public class AppointmentNode {
		private PatientAppointment data;
		private AppointmentNode left, right;

		public AppointmentNode(PatientAppointment data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public PatientAppointment getData() {
			return data;
		}

		public AppointmentNode getLeft() {
			return left;
		}

		public void setLeft(AppointmentNode left) {
			this.left = left;
		}

		public AppointmentNode getRight() {
			return right;
		}

		public void setRight(AppointmentNode right) {
			this.right = right;
		}

		public void setData(PatientAppointment data2) {
			// TODO Auto-generated method stub

		}
		// Method for searching appointment by time
	    public PatientAppointment searchByTime(String time) {
	        return searchByTime(root, time);
	    }

	    private PatientAppointment searchByTime(AppointmentNode node, String time) {
	        if (node == null || node.getData().getAppointmentTime().equals(time)) {
	            return (node != null) ? node.getData() : null;
	        }

	        if (time.compareTo(node.getData().getAppointmentTime()) < 0) {
	            return searchByTime(node.getLeft(), time);
	        } else {
	            return searchByTime(node.getRight(), time);
	        }
	    }

	    // Method for cancelling appointment
	    public void cancelAppointment(String time) {
	        root = cancelAppointment(root, time);
	    }

	    private AppointmentNode cancelAppointment(AppointmentNode node, String time) {
	        if (node == null) {
	            return null;
	        }

	        if (time.compareTo(node.getData().getAppointmentTime()) < 0) {
	            node.setLeft(cancelAppointment(node.getLeft(), time));
	        } else if (time.compareTo(node.getData().getAppointmentTime()) > 0) {
	            node.setRight(cancelAppointment(node.getRight(), time));
	        } else {
	            // Node to be deleted found
	            if (node.getLeft() == null) {
	                return node.getRight();
	            } else if (node.getRight() == null) {
	                return node.getLeft();
	            }

	            // Node with two children: Get the inorder successor (smallest in the right subtree)
	            node.setData((node.getRight()).getData());

	            // Delete the inorder successor
	            node.setRight(cancelAppointment(node.getRight(), node.getData().getAppointmentTime()));
	        }
	        return node;
	    }


		// Method for in-order traversal to display appointments in order
		public void printAppointmentsInOrder(AppointmentNode node) {
			if (node != null) {
				printAppointmentsInOrder(node.getLeft());
				System.out.println(node.getData());
				printAppointmentsInOrder(node.getRight());
			}
		}


}
}
