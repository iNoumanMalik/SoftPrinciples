
package highcohesion.withprinciple;

public class Pharmacy {
     public void dispenseMedication(Patient patient, String medication) {
        System.out.println("Medication " + medication + " dispensed to " + patient.getName());
    }
}
