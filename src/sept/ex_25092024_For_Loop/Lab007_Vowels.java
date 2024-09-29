package sept.ex_25092024_For_Loop;

public class Lab007_Vowels {
    public static void main(String[] args) {

        String string="Pramod";

        //char[] str= string.toCharArray();
        for(int i=0;i<string.length();i++)

        {
            if (string.charAt(i)== 'a'|| string.charAt(i)=='e' || string.charAt(i) == 'i'
            || string.charAt(i) == 'o' || string.charAt(i) == 'u')

                System.out.println(string.charAt(i));
               // System.out.println(str[i]);
            }

        }
    }

