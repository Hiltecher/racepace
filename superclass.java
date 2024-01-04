import java.util.Scanner;
public class superclass {

    private static int numLaps = 0;
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



        //scanner.close();


    }

}


