
//Recursive method to reverse number.
package dsproj;

public class MainD7 {
	public static void main(String[] args) {
		System.out.println(getrev(456,0));
	}
private static int getrev(int n,int r)
{
if(n==0)
	return r;
return getrev(n/10,r*10+n%10);
}

}
