//No.3

//program to check palindrome strings
import java.util.*;

public class Solution3 {
	static boolean isPalindrome(String str) {
        
		int i = 0, j = str.length() - 1; 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true; 
    } 
	public static void main(String args[]) {
		
		System.out.println("Enter the string :");
		Scanner input = new Scanner(System.in);
		String initial = input.nextLine();
		
		if (isPalindrome(initial)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
