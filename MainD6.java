
//Calculate the sum of digits
package dsproj;

public class MainD6 {
	public static void main(String[] args) {
		System.out.println(sumOfDigits(56));
	}
	
private static int sumOfDigits(int n)
{
	if(n<=9||n>=-9)
		return n;
	return n%10+sumOfDigits(n/10);
}

}
