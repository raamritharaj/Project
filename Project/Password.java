package App;
import java.util.Scanner;

public class Password {
	 public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.print("Please enter you password");
		   String s = sc.next();
		   int caps=0;
		   int smls=0;
		   int nums=0;
		   int sp_char=0;
		   if (s.length()<8)
		   {
			   System.out.println("Your Password must have 8 Character");
		   }
		   else if(s.length()>=8)
		   {
			   for (int i=0;i<s.length();i++)
			   {
				  if(s.charAt(0)>='A' && s.charAt(0)<='Z')
				  {
				  caps++;
			  }
		   else 
		   {
			   System.out.println("First letter must have uppercase");
			   break;
		   }
			   if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			   {
				   caps++;
			   }
			   else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			   {
				   smls++;
			   }
			   
			   else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			   {
				   nums++;
			   }
			   else
			   {
				   sp_char++;
			   }
			   }   
	             if((caps>=1) && (smls>=1) && (sp_char>=1) && (nums>=1))
	             {
	            	  System.out.println("Strong Password");
	            	  System.out.println("Your Password is valid");
	            	  System.out.println("Password Accepted");
	            	  	            	  
	             }
	             else
	             {
	            	 System.out.println("Your Password is not valid");
	            	  System.out.println("Password can not Accepted");
	            	  System.out.println("Your password contains minimum");
	            	      System.out.println(" your password should have 1-uppercase");
	            	      System.out.println(" your password should have 1-lowercase");
	            	      System.out.println(" your password should have 1-number");
	            	      System.out.println("1-special character");
	             }
		   }
	 }
}