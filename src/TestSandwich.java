/**
 * Created by jc338335 on 29/11/2016.
 */
public class TestSandwich
{
    public static void main(String[] args)
    {
        Sandwich s1 = new Sandwich("rye", 250, "egg salad", 100);
        Sandwich s2 = new Sandwich("oat", 300, "tuna", 150);
        Sandwich s3 = new Sandwich("grain", 350, "ham", 200);
        display(s1);
        display(s2);
        display(s3);
    }
    public static void display(Sandwich s)
    {
        Bread b = s.getBread();
        SandwichFilling f = s.getSandwichFilling();
        System.out.println("Bread Type: " + b.getBreadType() + " Calories per slice: " + b.getCalories());
        System.out.println("Filling Type: " + f.getFillingType() + " Calories per serving: " + f.getCalories());
        int total = b.getCalories() * 2 + f.getCalories();
        System.out.println("Total Calories: " + total);
    }

}
