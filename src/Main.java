import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      boolean rollAgain = true;

      Random random = new Random();
      while (rollAgain) {
        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);

        System.out.format(
          "You got %d and %d. That's %d all together.\n",
          dice1,
          dice2,
          dice1 + dice2
        );
        System.out.println(
          "Press enter to roll again or type \"Quit\" and then enter to quit."
        );
        rollAgain = !scanner.nextLine().matches("^\\s*[qQ](uit)?\\s*$");
      }
    }
  }
}
