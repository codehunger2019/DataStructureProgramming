
//to write the recursive method to print the number from 1 to n.
package dsproj;

public class MainD2 {
	static void display(int n) {
		if(n>1)
			display(n-1);
			System.out.println(n);
	}
	
	public static void main(String[] args) {
		System.out.println("Main method Started");
		display(3);
		System.out.println("Main method End");
	}

}
