import java.util.Scanner;

public class IT24102266Lab4Q1
{
 public static void main(String args[])
 { 
  int number;
  String status;
  
  Scanner num = new Scanner (System.in);
  
  System.out.print("Enter a number : ");
  number = num.nextInt();
  
  if (number==0)
   
    status="number is Zero";

  else if (number > 0 )

    status= "Positive";

  else 

    status = "Negative";

 System.out.print("The number is :" + status);
 }
}
