/**
 * Created by jc338335 on 29/11/2016.
 */
public class Bread
{
    String BreadType;
    int Calories;
    public final static String MOTTO = "The staff of life";
    public Bread(String Bread, int calories)
    {
        this.BreadType = Bread;
        this.Calories = calories;
    }
    public String getBreadType()
    {
        return BreadType;
    }
    public int getCalories()
    {
        return Calories;
    }
}
