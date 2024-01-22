import java.util.Scanner;
//Author: Jay Patel, 000881881
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("How many dice do you want?: ");
            int numberOfDice = scanner.nextInt(); // to accepts input from user

            int[] sides = new int[numberOfDice]; // this array stores sides for each die
            for (int i = 0; i < numberOfDice; i++) {
                System.out.print("Enter the number of sides for die " + (i + 1) + ": ");
                sides[i] = scanner.nextInt();
            }

            // creates new object named diceCollection
            DiceCollection diceCollection = new DiceCollection(sides);

            System.out.println(diceCollection);

            while (true) {
                System.out.println("\n1.Roll once | 2.Roll 100,000 times | 3.Quit");
                int choice = scanner.nextInt();

                switch (choice) {

                    case 1:

                        // this case will trigger rollAll method
                        diceCollection.rollAll();
                        System.out.println(diceCollection);
                        break;

                    case 2:

                        // this case will trigger histogram method
                        int[] histogram = diceCollection.histogram(100000);
                        System.out.print("\nHistogram:\n");
                        for (int i = 0; i < histogram.length; i++) {
                            if (histogram[i] != 0) {
                                System.out.println( i + " occurred: " + histogram[i] + " times."); // print histogram method (array)
                            }
                        }
                        break;

                    case 3:

                        // this case is for exit
                        System.out.println("Good bye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        }
    }