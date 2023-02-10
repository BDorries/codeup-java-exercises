import java.util.Random;
import java.util.Scanner;

public class HighLow {

    private static boolean quit = false;


    public static void main(String[] args) {
        int guessesRemaining = 20;
        Random rand = new Random();
        int targetNum = rand.nextInt(1,100);

        while(!quit) {
            System.out.printf("""
                    ******************************************
                    Guesses remaining: %d
                                
                    Please make a guess.
                    Your guess should be between 1 and 100.
                    Enter -1 to exit
                                
                    Your guess:\s
                    """,guessesRemaining);

            int input = getInteger(1,100);

            if (guessesRemaining < 1){
                quit = true;
                System.out.println("Unfortunately, you have run out of guesses. Game Over.");
            } else
            if(input == targetNum){
                System.out.println("Congrats! You win!");
                quit = true;
            } else
            if (input < targetNum){
                System.out.println("Higher!");
            } else
            if(input > targetNum){
                System.out.println("Lower!");
            }
            if(input == -1){
                quit = true;
            }
            guessesRemaining--;
        }
    }
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        int input = 0;

        while(true){
            try{
                input = scan.nextInt();
                break;
            }catch(Exception e){
                System.out.print("Not an integer. Please reenter: ");
                scan.nextLine();
            }
        }
        while(!isInRange(input,min,max)){
            System.out.print("Not in range. Please reenter: ");
            input = getInteger(min,max);
        }
        return input;
    }
    public static boolean isInRange(int num,int min,int max){
        return num <= max && num >= min;
    }
}
