import java.util.Scanner;
public class numberguessinggame
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            int secret = (int) (Math.random() * 100) + 1;
            int guessCount = 0;
            int guessLimit = 2;
            System.out.println("A Number between 1 and 100.");
            while (guessCount < guessLimit) 
            {
                System.out.print("Predict the Number: ");
                int guess = scanner.nextInt();
                guessCount++;
                if (guess == secret) 
                {
                    System.out.println("Congratulations! You predicted the number in " + guessCount + " guesses.");
                    break;
                } else if (guess < secret)
                {
                    System.out.println("Predicted Number is Low");
                } else 
                {
                    System.out.println("Predicted Number is High");
                }
            }
            if (guessCount == guessLimit)
            {
                System.out.println("You have run out of guesses. The number predicted is " + secret + ".");
            }
        }
    }
}
