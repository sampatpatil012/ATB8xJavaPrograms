package sept.ex_27092024_do_while;

public class Lab004_print_1_to_10_condition {
// condition:- when loop execute 5th time it print in the FIVE in console
    public static void main(String[] args) {
        int count=1;
        int number=0;
        do{
            number+=1;

            if(number == 5)
            {
                System.out.println("FIVE");
                //break;
            }else{
                System.out.println(number);
            }

            count++;


        }while(count<=10);
    }
}
