public class DeleteCharacters {
	public static void main(String[] args) {
		System.out.println(removeAllOccurrences("Hello, World", 'o'));
		System.exit(0);
	}
	private static String removeAllOccurrences(String str, char ch) {
		String newStr = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == ch) {
				continue;
			}
			newStr = str.charAt(i) + newStr;
		}
		return newStr;
	}
}