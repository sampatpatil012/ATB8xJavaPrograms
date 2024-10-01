package sept_Task.task_30092024;

public class Task001_Factorial_Program {
    public static void main(String[] args) {

        int num=5;
        int factorial=1;
        for(int i=1;i<=5;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("factorial of "+ num + " is   --->  " + factorial);
    }
}
