import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //Exercise 1a.
//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

        //Exercise 1b.
//        double num = 2;
//        final long MAX = 1000000;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num <= MAX);

        //Exercise 1c.
//        long num = 2;
//        final long MAX = 1000000;
//        for (num = 2; num < MAX; num *= num) {
//            System.out.println(num);
//        }

        //Exercise 2
//        for (int i = 1; i <= 100; i++) {
//            if((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println("FizzBuzz");
//            } else
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else
//            if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else{
//                System.out.println(i);
//            }
//        }

        //Exercise 3
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int targetNum = 0;
//
//        while(true){
//            try{
//                targetNum = scan.nextInt();
//                break;
//            }catch(Exception e){
//                System.out.print("Invalid input. Please reenter: ");
//                scan.nextLine();
//            }
//        }
//        System.out.printf("""
//            Here is your table
//            Number | Squared | Cubed
//            ------------------------
//            """);
//        for (int i = 1; i <= targetNum; i++) {
//            System.out.printf("""
//                   %-7d|%-9d|%d
//                    """,i,i*i,i*i*i);
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        int gradeVal = -1;
        char grade = 'x';

        while(true){
            try{
                gradeVal = scan.nextInt();
                break;
            }catch(Exception e){
                System.out.print("Invalid input. Please reenter: ");
                scan.nextLine();
            }
        }

        if(gradeVal > 88){
            grade = 'A';
        }else
            if(gradeVal >= 80){
            grade = 'B';
        }else
            if(gradeVal >= 67){
                grade = 'C';
        }else
            if(gradeVal >= 60){
                grade = 'D';
        }else grade = 'F';

        System.out.println("Your grade is: "+grade);
    }
}
