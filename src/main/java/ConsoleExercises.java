import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);
        System.out.println("\nEnter a number");
        Scanner scanner = new Scanner(System.in);
        int input;

        while(true){
            try{
                input = scanner.nextInt();
                break;
            }catch(Exception e){
                System.out.print("Invalid input. Please reenter: ");
                scanner.nextLine();
            }
        }
        System.out.println("You entered " + input);
        scanner.nextLine();

        String[] words;
        System.out.println("Enter three words");
        words = scanner.nextLine().split("\\s");
        System.out.println("You entered " + getStringsOnNewlines(words));

        System.out.print("Enter a length");
        double length = scanner.nextDouble();
        System.out.print("Enter a length");
        double width = scanner.nextDouble();

        System.out.println("Area: " +length*width);
        System.out.println("Perimeter: " +((length*2)+(width*2)));

        scanner.close();
    }

    /**
     * This method takes an array and outputs each element to a newline
     * @param arr array to output
     * @return String with newline characters between each element
     */
    public static String getStringsOnNewlines(String[] arr){
        StringBuilder str = new StringBuilder();
        for (String s : arr) {
            str.append(s).append("\n");
        }
        if(arr.length != 3){
            System.out.println("Reading is fundamental... I said three words.");
        }
        return str.toString();
    }
}
