package chapter6;

/*
--- Optional exercise ---
Calculate the final total of someone's cell phone bill.
Allow the operator to input the plan fee and the number of overage minutes.
Charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill.

--- Optional exercise v.2 ---
Enhance the Phone Bill program by redoing it in an object-oriented style.
A phone bill should have an id, base cost, number of allotted minutes, and number of minutes used.
One should also be able to calculate the overage, tax, and total on a phone bill, and also be able
to print an itemized bill.
Include the following constructors: default, id-only, all fields. No matter which constructor is used,
all fields should be set.
Create a class that instantiates a phone bill and prints the itemized bill.
 */

public class PhoneBillCalculator2 {

    public static void main(String[] args) {

        // Testing PhoneBill class with no args constructor
        PhoneBill phoneBill1 = new PhoneBill();
        phoneBill1.printPhoneBill();

        // Testing PhoneBill class with id args constructor
        PhoneBill phoneBill2 = new PhoneBill(3);
        phoneBill2.printPhoneBill();

        // Testing PhoneBill class with all args constructor
        PhoneBill phoneBill3 = new PhoneBill(5, 82.45, 300, 309);
        phoneBill3.printPhoneBill();

    }
}
