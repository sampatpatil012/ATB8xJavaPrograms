package sept.ex_30092024_Functions;

public class Lab005_with_Parameter_with_Return {
//with parameter with return type
    public static void main(String[] args) {
        int result=functionName(3,4);
        System.out.println(result);

    }

    public static int functionName(int a,int b){
        System.out.println("with parameter with return type");
        return a+b;

    }
}
