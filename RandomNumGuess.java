import java.util.Scanner;
import java.util.Random;

class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess it?\n");
        

        while (guess != randomNumber) {  // if both are equal then control expires and exits the loop else continues until true
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

           
            
            
            if (guess < randomNumber) {
                System.out.println("Too low! 📉 Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! 📈 Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
