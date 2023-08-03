import java.util.Scanner;

public class MethodExercisesNotes {

    public static void main(String[] args) {

        //Exercise 1
//        int num1 = 12;
//        int num2 = 2;
//
//        //number + number = result
//        System.out.println(num1 +" + " +num2 +" = " +addNumbers(num1,num2));
//        System.out.println(num1 +" - " +num2 +" = " +subtractNumbers(num1,num2));
//        System.out.println(num1 +" * " +num2 +" = " +multiplyNumbers(num1,num2));
//        System.out.println(num1 +" / " +num2 +" = " +divideNumbers(num1,num2));
//        System.out.println("The remainder of dividing " +num1 +" by " +num2 +" is " +getRemainder(num1, num2));
        //System.out.println("The number you entered is: " +getInteger(1,10));


        int factorial = getInteger(1,10);
        boolean quit = false;
        //int result;
        while(!quit){
            System.out.println("The factorial of " +factorial +" is " +getFactorial(factorial));
            //result = getFactorial(45); //why doesnt this work?
            System.out.println("The recursive factorial of " +factorial +" is " +getFactorialRecursion(factorial));
            System.out.println("Continue? (Y/N)");
            quit = quit();
        }
        quit = false;
        System.out.println("Enter a number of sides for a dice.");
        int faces = 0;
        while(!quit){
            faces = getInteger(1,50);
            System.out.println("The results are: "+rollDice(faces) +" and " +rollDice(faces));
            System.out.println("Continue? (Y/N)");
            quit = quit();
        }
    }

    public static boolean quit(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.charAt(0) != 'y';
    }
    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }
    public static int subtractNumbers(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplyNumbers(int num1, int num2){
        return num1 * num2;
    }
    public static int divideNumbers(int num1, int num2){
        return num1 / num2;
    }
    public static int getRemainder(int num1, int num2){
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer between "+min+" and "+max);
        int input;

        while(true){ //potentially an infinite loop. Be careful!
            if(scan.hasNextInt()){
                input = scan.nextInt();
                break;
            }else{
                System.out.println("That is not a number. Please enter a number");
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

    public static long getFactorial(long num){
        long result = 1; //why one? 2 reasons. multiply by zero and input has been validated.
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static long getFactorialRecursion(long num){
        if(num == 1){ //base case. once the function returns a 1, collapse the returns
            return 1;
        }
        return num * getFactorialRecursion(num -1);
    }
    /*
    4 * x = 24
    3 * x
    2 * x
    1
    */

    public static int rollDice(int faces){
//        return new Random().nextInt(1,faces);
        return (int)(Math.random() * faces) + 1;
    }
}
