import java.util.Scanner;

public class howmany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Please enter a String");
        String line = sc.nextLine();

        
        int vowel = 0, consonents = 0, specialCharacters = 0;
        char ch; 
        int size = line.length();

        for (int i = 0; i < size; i++) {
            ch = line.charAt(i);
            ch = Character.toUpperCase(ch);

            if (Character.isLetter(ch)) {
                
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    vowel++;
               
                else
                    consonents++;
            }
            
            else if (!Character.isDigit(ch))
                specialCharacters++;
        }

        
        System.out.println("Your String was -->: " + line);
        System.out.println("\nYour String contains " + vowel + " Vowels");
        System.out.println("Your String contains " + consonents + " Consonaants");
        System.out.println("Your String contains " + specialCharacters + " Special Characters");
    }
}
