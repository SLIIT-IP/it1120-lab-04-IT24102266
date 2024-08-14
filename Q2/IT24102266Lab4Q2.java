import java.util.Scanner;

public class IT24102266Lab4Q2
{
 public static void main(String args[])
 { 
   double exam_marks , lab_marks , exam_total , lab_total,total=0;
   double exam_per , lab_per  ;
   
   Scanner tot = new Scanner (System.in);
   
   System.out.println("Please enter exam marks (out of 100) :");
   exam_marks = tot.nextDouble();
  
   if(exam_marks< 0 || exam_marks >100)
  
       System.out.println("Invalied input for exam marks. ");
       

   
   System.out.print("Please enter lab marks (out of 100) :");
   lab_marks = tot.nextDouble();
    
     if(lab_marks< 0 || lab_marks >100)
     
       System.out.print("The percentage must add up to 100. ");
      
     

    
  
   System.out.print("Please enter the percentage given for the exam :");
   exam_per = tot.nextInt();
   
   System.out.print("Please enter the percentage given for the lab submission :");
   lab_per = tot.nextInt();
   
   
   exam_total = exam_marks * exam_per/100;
   lab_total = lab_marks * lab_per/100;

   total = exam_total + lab_total;
   
   System.out.print("Final exam marks :" + total);

   }
}
 
    
  
