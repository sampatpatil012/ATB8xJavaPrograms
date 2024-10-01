package sept_Task.task_23092024;

import java.util.Scanner;

public class Task002_Calculator_Switch_case_Scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number  ---> ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number  ---> ");
        int b = sc.nextInt();

        System.out.println("Select Operation");
        System.out.println("Addition:a  Subtraction:s  Multiplication:m  Division:d");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("Sum of given two number is  :--> " + (a + b));
                break;
            case 's':
                System.out.println("Difference between two number is  :--> " + (a - b));
                break;
            case 'm':
                System.out.println("Multiplication of given two number is  :--> " + (a * b));
                break;
            case 'd':
                System.out.println("Division of given two number is  :--> " + (a / b));
                break;
            default:
                System.out.println("Please check the operation or Invalid Input");
                break;
        }

    }
}
