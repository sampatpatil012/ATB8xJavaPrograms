package sept_Task.task_27092024;

public class Task002_Print_first_5_EVEN_Numbers_do_while {
    //print first 5 even numbers using do_while loop
    //even numbers -> 2,4,6,8,10
    public static void main(String[] args) {


        int count = 1;
        int number = 2; // Start with the first even number

        do {
            System.out.println(count + " --> " + number);
            number += 2; // Increment by 2 to get the next even number
            count++;
        } while (count <= 5);
    }
}

