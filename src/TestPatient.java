/**
 * Created by jc338335 on 29/11/2016.
 */
public class TestPatient
{

    public static void main(String[] args)
    {
        Patient p1 = new Patient();
        Patient p2 = new Patient("1", 23, "A", "-");
        display(p1);
        display(p2);
        p1.setID("2");
        p1.setAge(23);
        p1.setBloodType("AB");
        p1.setRH("-");
        display(p1);
    }

    public static void display(Patient p) {
        System.out.println("Patient Number: " + p.getID() + " Patient Age: " + p.getAge() + " Patient Blood Type: " + p.getBloodType() + p.getRH());
    }
}
