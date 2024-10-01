package sept.ex_30092024_Functions;

public class Lab001_functions {

    // function is nothing but block of code.(method)
    // we can define it and call it.
    // Why use methods? To reuse code: define the code once, and use it many times.
    /*   A method is a block of code which only runs when it is called.
        You can pass data, known as parameters, into a method.
        Methods are used to perform certain actions, and they are also known as functions.*/
    // one method or function we can call multiple times/
    //Two Types of Function
    /*   1.return Type (return value)
     *     2. Non-return type  (void)
     *  function is parameterised (with argument) or Non Parameterised (without arguments)
     *
     * [ syntax :-
     * accessModifier returnType functionName (ParameterType parameterName){
     * code to be executed
     * return value;
     * }]*/


    public static void main(String[] args) {
        functions();// here we call the method
    }

    // we define the function
    public static void functions () {
        System.out.println("Learning Java");
    }
}
