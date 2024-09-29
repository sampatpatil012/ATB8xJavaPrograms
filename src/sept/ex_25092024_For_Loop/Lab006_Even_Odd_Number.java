package sept.ex_25092024_For_Loop;

public class Lab006_Even_Odd_Number {
    public static void main(String[] args) {

        for(int i=0;i<=10;i++)
        {
            if(i%2 == 0)
            {
                System.out.println("Even Number --> " + i);
            }else{
                System.out.println("            Odd Number --> " + i);
            }
        }
    }
}
