package sept_Task.task_30092024;

public class Task003_Count_Vowels_Consonants {
    public static void main(String[] args) {
        String str = "Automation_1";
        int vCount = 0;
        int cCount = 0;
        String name = str.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i'
                    || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                vCount++;
            } // if the number is present in string then using else if  we can not consider in string
            // if not used else if we can calculate the 1 and hypen as string
            else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')
            {

                cCount++;
            }
        }


        System.out.println("Number of Vowels  : " + vCount);
        System.out.println("Number of consonant : " + cCount);
    }
}
