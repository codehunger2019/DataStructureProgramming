//To print the number from n to 1 without using a loop.
package dsproj;

public class MainD1 {
	static void Print(int n)
	{
		if(n<=0)
			return;
		System.out.println(n);
		Print(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Main method Start");
		Print(5);
		System.out.println("Main method End");
	}

}
