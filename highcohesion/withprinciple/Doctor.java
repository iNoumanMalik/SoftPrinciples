package highcohesion.withprinciple;

public class Doctor {

    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String prescribeMedication(Patient patient) {
        String medication = "";
        switch (patient.getIllness()) {
            case "Fever":
                medication = "Paracetamol";
                break;
            case "Headache":
                medication = "Ibuprofen";
                break;
            case "Allergy":
                medication = "Antihistamine";
                break;
            default:
                medication = "General Medicine";
        }
        System.out.println("Dr. " + name + " prescribed " + medication + " to " + patient.getName());
        return medication;
    }
}
