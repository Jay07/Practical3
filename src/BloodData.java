/**
 * Created by jc338335 on 29/11/2016.
 */
public class BloodData
{
    String bloodType;
    String RH;
    public BloodData()
    {
        this("O", "+");
    }
    public BloodData(String type, String rh)
    {
        bloodType = type;
        RH = rh;
    }
    public void setBloodType(String type)
    {
        bloodType = type;
    }
    public String getBloodType()
    {
        return bloodType;
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

