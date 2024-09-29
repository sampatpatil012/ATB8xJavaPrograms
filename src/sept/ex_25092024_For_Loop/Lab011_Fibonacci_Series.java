package sept.ex_25092024_For_Loop;

public class Lab011_Fibonacci_Series {
    //This program prints the Fibonacci series starting with 0 and 1,
    // followed by the sum of the previous two terms, up to the specified number of terms.

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        int n = 5;

        for (int i = 0; i <= n; i++) {
            //System.out.print(i + "   ");

            int num = num1 + num2;// 3...5....8...13....21....34
            num1 = num2;
            num2 = num;
            System.out.print(num+"   ");

        }

    }

    }
