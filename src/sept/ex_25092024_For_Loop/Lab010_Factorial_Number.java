package sept.ex_25092024_For_Loop;

public class Lab010_Factorial_Number {

    public static void main(String[] args) {
        int num1=5;
        int num2=1;
        int factorial=1;

        for(int i=1;i<=5;i++)
        {
            factorial=factorial*i;
        }

        System.out.println(factorial);


    }
}
