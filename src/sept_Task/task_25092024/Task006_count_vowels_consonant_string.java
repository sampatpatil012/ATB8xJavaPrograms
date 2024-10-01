package sept_Task.task_25092024;

public class Task006_count_vowels_consonant_string {

    //Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
    public static void main(String[] args) {
        String string = "vowels";
        int vCount = 0, cCount = 0;

        string = string.toLowerCase();

        for(int i = 0; i < string.length(); i++) {
            //Checks whether a character is a vowel
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e'
                    || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                //Increments the vowel counter
                vCount++;
            }
            //Checks whether a character is a consonant
            // if the number is present in string then using else if  we can not consider in string
            // if not used else if we can calculate the 1 and hypen as string
            else if(string.charAt(i) >= 'a' && string.charAt(i)<='z') {
                //Increments the consonant counter
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}



