import java.util.Scanner;

public class HighLow {

    private static boolean quit = false;


    public static void main(String[] args) {
        int guessesRemaining = 20;
        int guessesUsed = 0;

        while(!quit) {
            System.out.printf("""
                    ******************************************
                    Guesses remaining: %d
                                
                    Please make a guess.
                    Your guess should be between 1 and 100.
                                
                    Your guess: 
                    """,guessesRemaining);
            int input = getInteger(1,100);
            System.out.println("Input was "+input);
            quit = true;
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
