package sept.ex_30092024_Functions;

public class Lab006_parameterised_nonParameterised {

    public static void main(String[] args) {
        functionName1();

        String name=functionName2();
        System.out.println("return_String_Type  : -  pramod");

        functionName3("parameter is  :-  Automation_Testing");

       int result=functionName4(3,4);
        System.out.println("return_int_Type  :- "+result);

    }

    //without parametre without return type

    public static void functionName1(){
        System.out.println("functionName1 :- without parameter without return type ");
    }

    //without parameter with return type
    public static String functionName2(){
        System.out.println("functionName2 :- without parameter with return type ");
        return "Pramod";
    }

    //with parameter no return type

    public static void functionName3(String name){
        System.out.println("functionName3  :-  with parameter no return type ");
        System.out.println(name);
    }

    //with parameter with return type

    public static int functionName4(int a,int b){
        System.out.println("functionName4  :- with parameter with return type");
        return (a+b);
    }
}
