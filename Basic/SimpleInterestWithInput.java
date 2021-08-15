import java.util.Scanner;



class SimpleInterestWithInput
{

public static void main(String args[])
  
  
{
	
Scanner scanner=new Scanner(System.in);
   
System.out.println("Enter the Principal ammount");
       
int principal=scanner.nextInt();
       
System.out.println("Enter the rate");
      
int rate=scanner.nextInt();
      
System.out.println("Enter the time");
    
int time=scanner.nextInt();

float result=(principal*rate*time)/100;
   
System.out.println("this is the output "+result);
  
}

}
         	