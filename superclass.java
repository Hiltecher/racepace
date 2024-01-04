import java.util.Scanner;
public class superclass {

    private static int numLaps;
    private static double[] lapTimes;

    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Race Pace.");
        System.out.print("Please input number of laps e.g 9: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input, please enter an integer value e.g 5. ");
            scanner.next();
        }

        numLaps = scanner.nextInt();
        System.out.println("Your data will be measured over " + numLaps + " laps.");
        lapTimes = new double[numLaps];

        for (int i = 0; i < numLaps; i++) {
            System.out.print("Enter the lap time for lap " + (i + 1) + " in seconds.");
            lapTimes[i] = scanner.nextDouble();
        }

        System.out.println("Your recorded lap times are: ");
        for (int i = 0; i < numLaps; i++) {
            System.out.println("Lap " + (i + 1) + ": " + lapTimes[i]);
        }

        scanner.close();
    }
}


