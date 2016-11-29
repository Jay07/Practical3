/**
 * Created by jc338335 on 29/11/2016.
 */
public class Billing {
    public static void main(String[] args)
    {
        double bill;
        bill = computeBill(10.00);
        System.out.println("Total: $" +
                bill);
        bill = computeBill(10.00, 5);
        System.out.println("Total: $" +
                bill);
        bill = computeBill(10.00, 5, 20.00);
        System.out.println("Total: $" +
                bill);
    }

    public static double computeBill(double amt)
    {
        double bill = amt * 1.08;
        return bill;
    }

    public static double computeBill(double amt, int quantity)
    {
        double bill = amt * quantity;
        bill = bill * 1.08;
        return bill;
    }
    public static double computeBill(double amt, int quantity, double coupon)
    {
        double bill = amt * quantity;
        bill = bill - coupon;
        bill = bill * 1.08;
        return bill;
    }
}
