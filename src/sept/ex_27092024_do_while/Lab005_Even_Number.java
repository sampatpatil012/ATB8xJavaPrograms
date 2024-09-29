package sept.ex_27092024_do_while;

public class Lab005_Even_Number {
    public static void main(String[] args) {
        int number=6;

        int count = 1;
        int num = 1;
        do {
            if (number % 2 == 0) {
                System.out.println("EVEN NUMBER  --->  " + number);
                number += 1;
                count++;
            }
        }while (count <= 5) ;
    }
}