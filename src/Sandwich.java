/**
 * Created by jc338335 on 29/11/2016.
 */
public class Sandwich {
    Bread Bread;
    SandwichFilling SandwichFilling;
    public Sandwich(String bread, int breadCal, String filling, int fillingCal)
    {
        this.Bread = new Bread(bread, breadCal);
        this.SandwichFilling = new SandwichFilling(filling, fillingCal);
    }
    public Bread getBread()
    {
        return Bread;
    }
    public SandwichFilling getSandwichFilling()
    {
        return SandwichFilling;
    }

}
