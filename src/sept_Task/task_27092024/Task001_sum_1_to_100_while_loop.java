package sept_Task.task_27092024;

public class Task001_sum_1_to_100_while_loop {
    public static void main(String[] args) {

        int sum=0;
        int number = 1;

        {
            while (number <= 100) {
                sum = sum + number;
                number++;

            }

        }
        System.out.println(sum);

    }
}
