//Recursive method to return number of digits.
package dsproj;

public class MainD5 {
	public static void main(String[] args) {
		System.out.println(countDigits(5678));
	}
private static int countDigits(int n) {
	if(n<=9)
		return 1;
	return 1+countDigits(n/10);
}
}
