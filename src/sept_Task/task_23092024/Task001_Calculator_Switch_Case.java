package sept_Task.task_23092024;

public class Task001_Calculator_Switch_Case {

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;

        String str = "div";
        String operator=str.toLowerCase();

        switch (operator) {

            case "add":
                System.out.println("The Given Number of Addition is : ----> " + (num1 + num2));
                break;
            case "sub":
                System.out.println("The Given Number of Subtraction is : ----> " + (num1 - num2));
                break;
            case "mul":
                System.out.println("The Given Number of Multiplication is : ----> " + (num1 * num2));
                break;
            case "div":
                System.out.println("The Given Number of Divisin is : ----> " + (num1 / num2));
                break;
            default:
                System.out.println("Please check the operator");
                break;


        }

    }

}
