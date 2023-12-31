import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Choice = "";
        String Party = "Y - yes\tN - No = ";
        System.out.print(Party);
        Choice = in.nextLine();
        if (Choice.equalsIgnoreCase("Y"))
        {
            Random rnd = new Random();
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            final int firstSum = die1 + die2;
            System.out.printf("%d + %d = %d %n", die1, die2, firstSum);

            if (firstSum == 7 || firstSum == 11) {
                System.out.println("You win.");
                return;
            }
            if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
                System.out.println("You lose.");
                return;
            }

            int newSum = 0;
            while (newSum != firstSum && newSum != 7) {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                newSum = die1 + die2;
                System.out.printf("%d + %d = %d %n", die1, die2, newSum);
            }

            if (newSum == firstSum) {
                System.out.println("You win.");
            }
            else {
                System.out.println("You lose.");
            }
            System.out.println("Made a point = " + newSum);


        }
        if (Choice.equalsIgnoreCase("N"))
        {
            System.out.println("Stop game");
        }
        else
        {
            System.out.println("wrong input");
        }
    }
}