package highcohesion.withprinciple;

public class Patient {

    private String name;
    private int id;
    private String illness;

    public Patient(String name, int id, String illness) {
        this.name = name;
        this.id = id;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getIllness() {
        return illness;
    }
}
