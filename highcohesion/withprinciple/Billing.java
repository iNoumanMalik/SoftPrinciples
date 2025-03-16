package highcohesion.withprinciple;

public class Billing {

    public void generateBill(Patient patient, double amount) {
        System.out.println("Bill of $" + amount + " generated for " + patient.getName());
    }
}
