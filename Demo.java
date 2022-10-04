public class Demo 
{ 

 

    Demo()
    { 
      System.out.println("Zero argument constructor"); 
    } 

 
    Demo(int a)
    { 
       System.out.println("One argument constructor"+a); 
    } 

 
    Demo(int a,int b)
    { 
       System.out.println("Two arguments constructor"+(a+b));
    }
public static void main(String[] args) 
{ 


 
    Demo d = new Demo(); 
       d= new Demo(20);   
        d= new Demo(10,15);  
   } 
}
