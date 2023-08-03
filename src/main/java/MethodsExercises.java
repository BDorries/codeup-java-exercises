import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        //Exercise 1
        int num1 = 38;
        int num2 = 3;

        System.out.println(num1+" + "+num2+" = "+addNums(num1,num2));
        System.out.println(num1+" - "+num2+" = "+subtractNums(num1,num2));
        System.out.println(num1+" * "+num2+" = "+multiplyNums(num1,num2));
        System.out.println(num1+" / "+num2+" = "+divideNums(num1,num2));

        //Exercise 2
        System.out.println("Your number between 1 and 10 is: "+ getInteger(1,10));

        //Exercise 3
        int factorial = getInteger(1,10);
        System.out.println("The factorial of "+factorial+" is "+ getFactorial(factorial));

        //Exercise 4
        System.out.println("Enter a number of sides for a dice.");
        int faces = (getInteger(1,30));
        System.out.println("The results are: "+rollDice(faces) +" and " +rollDice(faces));
    }
    public static int addNums(int num1, int num2){
        return num1+num2;
    }
    public static int subtractNums(int num1, int num2){
        return num1-num2;
    }
    //made recursive because the exercise is weird
    public static int multiplyNums(int num1, int num2){
        if (num2 > 0) {
            return num1 + multiplyNums(num1,num2 - 1);
        } else {
            return 0;
        }    }
    public static int divideNums(int num1, int num2){
        try{
            return num1/num2;
        }catch(Exception e){
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer between "+min+" and "+max);
        int input;

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
    public static long getFactorial(int num){
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
    public static int rollDice(int faceNum){
        Random rand = new Random();
        return rand.nextInt(1,faceNum);
    }
}
