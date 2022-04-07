package Helper;



import java.util.Scanner;

public final class Utils {
    private static final Scanner input = new Scanner(System.in);

    private Utils() {
        throw new java.lang.UnsupportedOperationException("Utility class and cannot be instantiated");
    }

    /**
     * Will loop infinitely printing text until a valid input has been read.
     * 
     * @param text
     * @return Integer
     */
    public static int nextInt(String text) {
        while (true) {
            System.out.print(text);
            try {
                return input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
                input.nextLine();
            }
        }
    }

    /**
     * Will loop infinitely printing text until a valid input has been read.
     * 
     * @param text
     * @return double
     */
    public static double nextDouble(String text) {
        while (true) {
            System.out.print(text);
            try {
                return input.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input, try again.");
                input.nextLine();
            }
        }
    }
}
