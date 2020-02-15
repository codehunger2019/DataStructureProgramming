//
package dsproj;

public class MainD9 {

public static void main(String[] args) {
	boolean rs=isPerfect(28);
	if(rs==true)
		System.out.println("Perfect Number");
	else
		System.out.println("Not Perfect Number");
}

private static boolean isPerfect(int n) {

	// TODO Auto-generated method stub
	return checkPerfect(n,1,2);

}
private static boolean checkPerfect(int n,int sum, int i)
{
	if(i>n/2)
		return(n==sum);
	if(n%2==0)
		sum=sum+i;
		return checkPerfect(n,sum,i+1);
}

}
