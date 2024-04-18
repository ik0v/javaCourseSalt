package chapter6;
import java.util.Scanner;

/*
    PhoneBill class.
    Has private fields (id, baseCost, allottedMins, usedMins), as well as final fields tax and overageMinCharge.
    Class has 3 constructors (no args, with id arg, all args)

    Class had methods to calculate overage minutes, overage minutes cost, tax and total.
    Also, a method to print all these values.
*/

public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMins;
    private int usedMins;
    private final double taxRate = 0.15;
    private final double overageMinCharge = 0.25;
    private Scanner scanner = new Scanner(System.in);

    public PhoneBill() {
        System.out.println("Enter id of the phone bill: ");
        setId(scanner.nextInt());

        System.out.println("Enter base cost: ");
        setBaseCost(scanner.nextDouble());

        System.out.println("Enter allotted minutes: ");
        setAllottedMins(scanner.nextInt());

        System.out.println("Enter used minutes: ");
        setUsedMins(scanner.nextInt());
    }

    public PhoneBill(int id) {
        this.id = id;
        System.out.println("Enter base cost: ");
        setBaseCost(scanner.nextDouble());

        System.out.println("Enter allotted minutes: ");
        setAllottedMins(scanner.nextInt());

        System.out.println("Enter used minutes: ");
        setUsedMins(scanner.nextInt());
    }

    public PhoneBill(int id, double baseCost, int allottedMins, int usedMins) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMins = allottedMins;
        this.usedMins = usedMins;
    }

    public int getOverageMins() {
        return Math.max(0, usedMins - allottedMins); // a nice way to determine if we have overage minutes
                                                     // in this bill. If not, 0 is returned.
    }

    public double getOverageMinCost() {
        return getOverageMins() * overageMinCharge;
    }

    public double getTax() {
        return (baseCost + getOverageMinCost()) * taxRate;
    }

    public double getTotal() {
        return baseCost + getOverageMinCost() + getTax();
    }

    public void printPhoneBill() {
        System.out.printf("Phone bill id is %d\n", id);
        System.out.printf("Your plan fee is $%.2f\n", baseCost);
        System.out.printf("Your overage minutes fee is $%.2f\n", getOverageMinCost());
        System.out.printf("Your tax is $%.2f\n", getTax());
        System.out.printf("Your total bill is $%.2f\n", getTotal());
        System.out.println();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setAllottedMins(int allottedMins) {
        this.allottedMins = allottedMins;
    }

    public void setUsedMins(int usedMins) {
        this.usedMins = usedMins;
    }

}
