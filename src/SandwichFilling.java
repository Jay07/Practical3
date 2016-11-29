/**
 * Created by jc338335 on 29/11/2016.
 */
public class SandwichFilling {
    String FillingType;
    int Calories;
    public SandwichFilling(String Filling, int calories)
    {
        this.FillingType = Filling;
        this.Calories = calories;
    }
    public String getFillingType()
    {
        return FillingType;
    }
    public int getCalories()
    {
        return Calories;
    }
}
