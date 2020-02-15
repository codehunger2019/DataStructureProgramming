
//To write a Recursive method to calculate the sum of natural numbers.
package dsproj;

public class MainD3{
	static int sumOfNatural(int n) {
	if(n==1)
		return 1;
	return n+sumOfNatural(n-1);
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		int sum=sumOfNatural(5);
		System.out.println("Sum is:"+sum);
		System.out.println("Main method ends");
	}

}
