package sept_Task.task_25092024;

public class Task005_Prime_Number_For_Loop {
    /* what is prime number
     * A prime is a natural number greater than 1 that has no positive divisors
     *  other than 1 and itself. For example 2, 3, 5, 7, 11,….. are prime numbers.
     * */
    public static void main(String[] args) {

        //Prime Number from 1 to 100. (for loop)
        for (int i = 1; i <= 100; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i + " ----> is not a PRIME Number ");
            }else{
                System.out.println(i + " ----> is PRIME Number");
            }
        }

    }
}




