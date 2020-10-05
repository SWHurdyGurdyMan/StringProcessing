import java.util.Scanner;
public class Comma {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a numeric string: ");
			 String digits = input.nextLine();
			 while (digits.length() == 0) {
				 break;
			 }
			 System.out.println(addCommasToNumericString(digits));
			 input.close();
			 System.exit(0);
		 }
	private static String addCommasToNumericString(String digits) {		
		int length = digits.length();
		int i = 0;
		String x = "";
		for(int v = length - 1; v >= 0; v--) {
			x = digits.charAt(v) + x;
			i++;
			if((i % 3) == 0 && v > 0) {
				x = "," + x;
			}
		}
		return x;
	}
}