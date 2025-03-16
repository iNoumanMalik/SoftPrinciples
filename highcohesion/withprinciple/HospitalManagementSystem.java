package highcohesion.withprinciple;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        // Register Patient
        Patient patient = new Patient("John Doe", 101, "Fever");

        // Assign Doctor based on illness
        Doctor doctor;
        switch (patient.getIllness()) {
            case "Fever":
                doctor = new Doctor("Tyrion", "General Physician");
                break;
            case "Headache":
                doctor = new Doctor("Smith", "Orthopedics");
                break;
            case "Allergy":
                doctor = new Doctor("Brown", "Allergist");
                break;
            default:
                doctor = new Doctor("Robb", "General Physician");
        }
        System.out.println("Dr. " + doctor.getName() + " (" + doctor.getSpecialization() + ") assigned to " + patient.getName());

        // Doctor prescribes medication
        String medication = doctor.prescribeMedication(patient);

        // Pharmacy dispenses medication (automatically receives medication)
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.dispenseMedication(patient, medication);

        // Generate bill
        Billing billing = new Billing();
        billing.generateBill(patient, 150.0);
    }

}
