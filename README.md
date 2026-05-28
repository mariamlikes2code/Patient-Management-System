# Patient Appointment Management System

A Java console application for managing patient appointments in a healthcare setting. Built using a Binary Search Tree (BST) to efficiently handle scheduling, searching, and cancellation by appointment time.

## How to Run

1. Clone the repository
2. Open the project in your preferred Java IDE (Eclipse, IntelliJ, etc.)
3. Run `AppointmentSystem.java`

## Features

- Schedule a new patient appointment
- Search for an appointment by time
- Cancel an appointment by time
- View all appointments in chronological order (in-order BST traversal)

## Project Structure

| File | Description |
|------|-------------|
| `AppointmentSystem.java` | Entry point; handles the menu loop and user input |
| `AppointmentBST.java` | Implements the Binary Search Tree with add, search, cancel, and in-order traversal |
| `PatientAppointment.java` | Represents a single patient appointment with ID, name, and time |

## Concepts Used

- Binary Search Tree (BST) for efficient data management
- Recursive insertion, search, and deletion
- In-order traversal for sorted appointment display
- Object-oriented design with separate classes for data and logic
- Scanner input handling

## Author

Mariam — [@mariamlikes2code](https://github.com/mariamlikes2code)
