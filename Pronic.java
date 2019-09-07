import java.util.*;
import java.math.*;

class Test {
	public boolean checkPronic(int x) {
		int n = (int) (Math.sqrt(x));
		if (n * (n + 1) == x)
			return true;
		return false; 
	}
}
public class Pronic {
	public static void main(String args [ ]) {
		Scanner input = new Scanner(System.in);
		int test_data = input.nextInt();
		Test t = new Test();
		if (t.checkPronic(test_data)) {
			System.out.println("Pronic");
		} else {
			System.out.println("Not Pronic");
		}
	}
}