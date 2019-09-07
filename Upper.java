//Accept String in lower cases and convert the begining of each word in uppercase

import java.util.*;

public class Upper {
   static String convert(String str) {
        // Create a char array of given String 
        char ch[] = str.toCharArray(); 
        for (int i = 0; i < str.length(); i++) { 
  
            // If first character of a word is found 
            if (i == 0 && ch[i] != ' ' ||  ch[i] != ' ' && ch[i - 1] == ' ') { 
  
                // If it is in lower-case 
                if (ch[i] >= 'a' && ch[i] <= 'z') { 
  
                    // Convert into Upper-case 
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
        }
        // Convert the char array to equivalent String 
        String st = new String(ch); 
        return st; 
    } 
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Strings :");
		String lower = input.nextLine();
		System.out.println(convert(lower));
	}
}
