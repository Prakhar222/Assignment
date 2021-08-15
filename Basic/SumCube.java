import java.util.*;
import java.lang.*;
class SumCube
{
  
   
    public static int sumOfCube(int n)
    {
        int sum = 0;
        for (int x=1; x<=n; x++)
            sum += x*x*x;
        return sum;
    }
  

    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter");
        int n= sc.nextInt();
        System.out.println(sumOfCube(n));
  
    }
}