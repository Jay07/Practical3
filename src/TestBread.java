/**
 * Created by jc338335 on 29/11/2016.
 */
public class TestBread
{
    public static void main(String[] args)
    {
        Bread b1 = new Bread("rye", 250);
        Bread b2 = new Bread("oat", 300);
        Bread b3 = new Bread("grain", 350);
        display(b1);
        display(b2);
        display(b3);
    }
    public static void display(Bread b)
    {
        System.out.println("Bread Type: " + b.getBreadType() + " Calories per slice: " + b.getCalories());
        System.out.println(b.MOTTO);
    }
}
