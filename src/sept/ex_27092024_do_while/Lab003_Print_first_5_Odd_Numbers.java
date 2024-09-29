package sept.ex_27092024_do_while;

public class Lab003_Print_first_5_Odd_Numbers {
    public static void main(String[] args) {


        int count = 1;
        int num = 1;//start with first even number
        do {
            System.out.println(num);
            num += 2;//increment number by 2 so we get the next even number
            count++;
        } while (count <= 5);
    }
}