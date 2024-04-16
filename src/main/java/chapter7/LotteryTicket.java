package chapter7;
import java.util.Arrays;
import java.util.Random;

// arrays

public class LotteryTicket {

    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NR = 69;

    public static void main(String[] args) {
        int[] tickets = generateNumbers();
        Arrays.sort(tickets);
        printTickets(tickets);
//        System.out.println(Arrays.toString(ticket)); // another way to print array
    }

    public static int[] generateNumbers() {
        int[] tickets = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
            // Generate random number then search to make sure it doesn't already
            // exist in the array. If so, regenerate, and search again.
            do {
                randomNumber = random.nextInt(MAX_TICKET_NR) + 1;
            } while (binarySearch(tickets, randomNumber));
            // Number is unique if we get here. Add it to the array.
            tickets[i] = randomNumber;
        }
        return tickets;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {
        for (int i : array) {
            if(i == numberToSearchFor) return true;
        }
        return false;
    }

    /**
     * Does binary search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean binarySearch(int[] array, int numberToSearchFor) {
        // Make a copy of argument array in order not to change values in it
        int[] copy = Arrays.copyOf(array, array.length);

        // Array must be sorted first
        Arrays.sort(copy);

        // Perform a binary search, result is int
        int index = Arrays.binarySearch(copy, numberToSearchFor);

        // Print out message if duplicate was found
        if(index >= 0) System.out.println("Found duplicate: " + numberToSearchFor);

        // Return result
        return index >= 0;
    }

    public static void printTickets(int[] tickets) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(tickets[i] + " ");
        }
    }
}
