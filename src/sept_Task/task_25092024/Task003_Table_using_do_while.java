package sept_Task.task_25092024;

public class Task003_Table_using_do_while {
    public static void main(String[] args) {
        int count = 1;
        int num = 10;
        do {
            int temp = num * count;
            System.out.println(num + "X" + count + " = " + (num * count));
            //System.out.println(num);
            count++;
        } while (count <= 10);
    }
}
