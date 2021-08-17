/*
 * 
 * author 
 * Prakhar Gupta
 */
class Fibonacci 
{
	public static void main(String args[]) 
	{
		int num=10;
		int n1=0,n2=1,n3;
		System.out.println(n2);
		for(int i=2;i<=num;i++) {
			n3=n1+n2;    
			System.out.println(n3);    
			n1=n2;    
			n2=n3; 
		}
	}
}
