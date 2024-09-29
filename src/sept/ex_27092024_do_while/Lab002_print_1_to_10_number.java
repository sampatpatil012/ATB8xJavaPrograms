package sept.ex_27092024_do_while;

public class Lab002_print_1_to_10_number {

    //print 1 to 10 number using do while loop

    public static void main(String[] args) {

        int num=1;
        int count=1;

        do{
            System.out.println(num);
            num+=1;
            count++;
        }while(count<=10);
    }
}
