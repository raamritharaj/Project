import java.util.Scanner;
 public class Main{
  public static void main(String[]args)
{
  Scanner in = new Scanner(System.in);
   System.out.print("Enter the first number");
   int a= in.nextInt();
    System.out.print("Enter the second number");
     int b= in.nextInt();
       System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
         System.out.println(a + "*" + b + "=" + (a * b));
          System.out.println(a + "/" + b + "=" + (a / b));
           System.out.println(a + "mod" + b + "=" +(a % b));
}
}

  


   
