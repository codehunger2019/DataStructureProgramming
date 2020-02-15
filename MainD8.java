
//Recursive Method to check number is happy number or not.
package dsproj;

public class MainD8 {
	public static void main(String[] args) {
		boolean rs=isHappyNumber(25);
		if(rs=true)
			System.out.println("Happy Number:");
		else
			System.out.println("Not Happy Number");
	}
private static boolean isHappyNumber(int n){
	if(n<10)
		return n==1||n==7;
	return isHappyNumber(sumOfSquare(n));
	

}
private static int sumOfSquare(int n) {
	// TODO Auto-generated method stub
	
	if(n<10)
	return n*n;
	return (n%10)*(n%10)+sumOfSquare(n/10);
}



}