import java.util.*;

class Patient {
    int id;
    String name;
    int age;
    String gender;
    String diagnosis;

    Patient(int id, String name, int age, String gender, String diagnosis) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.diagnosis = diagnosis;
    }
}

class Appointment {
    int appointmentId;
    int patientId;
    String doctorName;
    String date;

    Appointment(int appointmentId, int patientId, String doctorName, String date) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorName = doctorName;
        this.date = date;
    }
}

class Billing {
    int patientId;
    double amount;

    Billing(int patientId, double amount) {
        this.patientId = patientId;
        this.amount = amount;
    }
}

class InventoryItem {
    String itemName;
    int quantity;

    InventoryItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }
}

class Staff {
    int staffId;
    String name;
    String role;

    Staff(int staffId, String name, String role) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
    }
}

public class Hospital {
    static List<Patient> patients = new ArrayList<>();
    static List<Appointment> appointments = new ArrayList<>();
    static List<Billing> billings = new ArrayList<>();
    static List<InventoryItem> inventory = new ArrayList<>();
    static List<Staff> staffList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nHospital Management System created by MD G A Quadir");
            System.out.println("1. Register Patient\n2. Schedule Appointment\n3. Add Billing\n4. Manage Inventory\n5. Add Staff\n6. Display Data\n7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int pid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String pname = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter Diagnosis: ");
                    String diagnosis = scanner.nextLine();
                    patients.add(new Patient(pid, pname, age, gender, diagnosis));
                    break;

                case 2:
                    System.out.print("Enter Appointment ID: ");
                    int aid = scanner.nextInt();
                    System.out.print("Enter Patient ID: ");
                    int apid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String dname = scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();
                    appointments.add(new Appointment(aid, apid, dname, date));
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    int bpid = scanner.nextInt();
                    System.out.print("Enter Billing Amount: ");
                    double amount = scanner.nextDouble();
                    billings.add(new Billing(bpid, amount));
                    break;

                case 4:
                    System.out.print("Enter Item Name: ");
                    String item = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = scanner.nextInt();
                    inventory.add(new InventoryItem(item, qty));
                    break;

                case 5:
                    System.out.print("Enter Staff ID: ");
                    int sid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String sname = scanner.nextLine();
                    System.out.print("Enter Role: ");
                    String role = scanner.nextLine();
                    staffList.add(new Staff(sid, sname, role));
                    break;

                case 6:
                    System.out.println("\nPatients:");
                    for (Patient p : patients) {
                        System.out.println(p.id + " - " + p.name + " - " + p.age + " - " + p.gender + " - " + p.diagnosis);
                    }
                    System.out.println("\nAppointments:");
                    for (Appointment a : appointments) {
                        System.out.println(a.appointmentId + " - " + a.patientId + " - " + a.doctorName + " - " + a.date);
                    }
                    System.out.println("\nBilling:");
                    for (Billing b : billings) {
                        System.out.println(b.patientId + " - Rs." + b.amount);
                    }
                    System.out.println("\nInventory:");
                    for (InventoryItem i : inventory) {
                        System.out.println(i.itemName + " - Qty: " + i.quantity);
                    }
                    System.out.println("\nStaff:");
                    for (Staff s : staffList) {
                        System.out.println(s.staffId + " - " + s.name + " - " + s.role);
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
