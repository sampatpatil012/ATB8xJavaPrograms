package sept.ex_23092024;

public class Lab076_SwitchCase_String {
    public static void main(String[] args) {

        String browser = "IE";
        switch (browser){
            case "chrome":
                System.out.println("You Have Entered Chrome Browser");
                break;
            case "IE":
                System.out.println("You Have Entered Internet Explorer browser");
                break;
            default:
                System.out.println("Please Select Correct Browser");
                break;
        }
    }

    }




