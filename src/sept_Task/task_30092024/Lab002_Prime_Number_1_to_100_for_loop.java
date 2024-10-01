package sept_Task.task_30092024;

public class Lab002_Prime_Number_1_to_100_for_loop {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++)
        {
            if (i%2 == 0)
            {
                System.out.println(i + " --> Prime Number ");
            }
        }
    }
}
