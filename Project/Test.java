package cc;

import java.util.Scanner;

public class Test {
             public static void main(String[] args) {
            	 Scanner number = new Scanner(System.in);
            	 System.out.println("Enter the card number");
            	  String no=number.next();
            	   int length=no.length();	
            	 
            	   if(length==15)
            	   {
            		   if((no.startsWith("34")) || (no.startsWith("37")))
            		   {
            			   System.out.println("American Express");
            		   }
            		   else if((no.startsWith("2123")) || (no.startsWith("1800")))
            		   {
            			   System.out.println("JCD");
            		   }
            	   }
            	   else if((length==13) || ((length==16)))
            	   { 	
            		            		   
            		   if((no.startsWith("4")))
            		   {
            			   System.out.println("Visa card");
            		   }
            		   else if((no.startsWith("51")) || 
            				   (no.startsWith("52")) || 
            				   (no.startsWith("53")) || 
            				   (no.startsWith("54")) ||  
            				   (no.startsWith("55")))
            				   {
            			        System.out.println("Master card");
            				   }
            		   else if(no.startsWith("6011"))
            		   {
            			   System.out.println("Discover card");
            			   
            		   }
            		   else if(no.startsWith("3"))
            		   {
            			   System.out.println("JCB Card");
            		   }
            		   else if(length==14)
            		   {
            			   if((no.startsWith("36"))|| 
            					   (no.startsWith("38"))  || 
            					   (no.startsWith("300")) || 
            					   (no.startsWith("301")) || 
            					   (no.startsWith("302")) || 
            					   (no.startsWith("303")) || 
            					   (no.startsWith("304")) ||
            					   (no.startsWith("305")))
            			   {
            				   System.out.println("Diners Club");
            			   }
            				  
            		   }
            		    else
            		   {
            			  System.out.println("Invalid credit or debit card number");
            		   }
            		        // Luhn's Algorithm 
            		     char ch[] =no.toCharArray();
            		     int dble []= new int[ch.length /2];
            		     int remain[]=new int[dble.length];
            		      int j=0;
            		      // finding double of every second elements and store dble[]-- right to left
            		      for(int i=ch.length-2;i>=0; i-=2)
            		      {
            		    	dble[j]=(ch[i]-48)*2;
            		    	j++;
            		    	
            		      }
            		      // finding remaining number of every second and store remain[] elements -- left to right
            		      int k=0;
            		       for(int i=1; i<ch.length; i+=2)
            		       {
            		    	   remain[k]=(ch[i]-48);
            		    	   k++;
            		       }
            		       // addition of dble values
            		       int sum1=0;
            		       for(int i=0; i<dble.length; i++) // 16, 18..until dble value
            		       {
            		    	   int rem=dble[i]%10; // 6// 8
            		    	   int quo=dble[i]/10;  // 1 // 1 
            		    	   sum1+=quo+rem;  //0+1+6=7 // 7+1+8=16.... 
            		       }
            		       // addition of remain values
            		       int sum2=0;
            		       for(int i=0; i<remain.length; i++)
            		       {
            		    	   sum2+=remain[i]; // 0+6=6// 6+4=10//...
            		       }
            		         int result=sum1+sum2;
            		          if (result%10==0)
            		        	  System.out.println("This card is valid");
            		          else
            		        	   System.out.println("This card is not valid");
            	   }
             }
             

}
