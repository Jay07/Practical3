/**
 * Created by jc338335 on 29/11/2016.
 */
public class Patient {
    String ID;
    int Age;
    String BloodType;
    String RH;
    public Patient()
    {
        ID = "0";
        Age = 0;
        BloodType = "O";
        RH = "+";}
    public Patient(String id, int age, String type, String rh)
    {
        this.ID = id;
        this.Age = age;
        this.BloodType = type;
        this.RH = rh;
    }
    public String getID()
    {
        return ID;
    }
    public void setID(String id)
    {
        this.ID = id;
    }
    public int getAge()
    {
        return Age;
    }
    public void setAge(int age)
    {
        this.Age = age;
    }
    public void setBloodType(String type)
    {
        BloodType = type;
    }
    public String getBloodType()
    {
        return BloodType;
    }
    public void setRH(String rh)
    {
        RH = rh;
    }
    public String getRH()
    {
        return RH;
    }

}
