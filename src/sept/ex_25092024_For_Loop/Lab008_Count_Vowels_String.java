package sept.ex_25092024_For_Loop;

public class Lab008_Count_Vowels_String {
    public static void main(String[] args) {

            String str="Pramod";
            int count=0;
            for(int i=0;i< str.length();i++)
            {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    count++;
                }
            }

        System.out.println("The Total Number of Vowels Are Present in String   :- "+count);

    }
}


