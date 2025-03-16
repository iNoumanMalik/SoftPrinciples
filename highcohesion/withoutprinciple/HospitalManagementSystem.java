package highcohesion.withoutprinciple;

public class HospitalManagementSystem {

    private String patientName;
    private int patientId;
    private String patientIllness;
    private String doctorName;
    private String doctorSpecialization;
    private String prescribedMedication;
    private double fee;

    // Register Patient
    public void registerPatient(String name, int id, String illness) {
        this.patientName = name;
        this.patientId = id;
        this.patientIllness = illness;
        System.out.println("Patient " + name + " registered with ID " + id + " and illness " + illness);
    }

    // Assign Doctor based on illness
    public void assignDoctor() {
        switch (patientIllness) {
            case "Fever":
                this.doctorName = "Tyrion";
                this.doctorSpecialization = "General Physician";
                break;
            case "Headache":
                this.doctorName = "Smith";
                this.doctorSpecialization = "Orthopedics";
                break;
            case "Allergy":
                this.doctorName = "Brown";
                this.doctorSpecialization = "Allergist";
                break;
            default:
                this.doctorName = "Robb";
                this.doctorSpecialization = "General Physician";
        }
        System.out.println("Dr. " + doctorName + " (" + doctorSpecialization + ") assigned to " + patientName);
    }

    // Doctor prescribes medication
    public void prescribeMedication() {
        switch (patientIllness) {
            case "Fever":
                this.prescribedMedication = "Paracetamol";
                break;
            case "Headache":
                this.prescribedMedication = "Ibuprofen";
                break;
            case "Allergy":
                this.prescribedMedication = "Antihistamine";
                break;
            default:
                this.prescribedMedication = "General Medicine";
        }
        System.out.println("Dr. " + doctorName + " prescribed " + prescribedMedication + " to " + patientName);
    }

    // Pharmacy dispenses medication
    public void dispenseMedication() {
        System.out.println("Medication " + prescribedMedication + " dispensed to " + patientName);
    }

    // Generate bill
    public void generateBill(double amount) {
        this.fee = amount;
        System.out.println("Bill of $" + amount + " generated for " + patientName);
    }

    public static void main(String[] args) {
        System.out.println("Without Princple");
        HospitalManagementSystem hospital = new HospitalManagementSystem();

        // Register Patient
        hospital.registerPatient("John Doe", 101, "Fever");

        // Assign Doctor
        hospital.assignDoctor();

        // Doctor prescribes medication
        hospital.prescribeMedication();

        // Pharmacy dispenses medication
        hospital.dispenseMedication();

        // Generate bill
        hospital.generateBill(150.0);
    }

}
