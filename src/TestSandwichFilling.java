/**
 * Created by jc338335 on 29/11/2016.
 */
public class TestSandwichFilling
{
    public static void main(String[] args)
    {
        SandwichFilling f1 = new SandwichFilling("egg salad", 100);
        SandwichFilling f2 = new SandwichFilling("tuna", 150);
        SandwichFilling f3 = new SandwichFilling("ham", 200);
        display(f1);
        display(f2);
        display(f3);
    }
    public static void display(SandwichFilling f)
    {
        System.out.println("Sandwich Filling: " + f.getFillingType() + " Calories per serving: " + f.getCalories());
    }
}
