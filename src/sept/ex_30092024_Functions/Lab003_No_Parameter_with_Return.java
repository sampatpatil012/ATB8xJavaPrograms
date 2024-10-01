package sept.ex_30092024_Functions;

public class Lab003_No_Parameter_with_Return {

  //without parameters but with return type.
    public static void main(String[] args) {
        String value =functionName();
        System.out.println(value);

    }

    public static String functionName(){
        System.out.println("without parameters but with return type. ");
        return "return value";

    }
}
