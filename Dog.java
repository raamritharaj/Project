package inheritanceProgram1;
  class Dog
   {
     void walk()
       {
         System.out.println("Dog runs very fast");
         }
 }
     class Dog1 extends Dog
      {
          void walk(int x)
           {
             System.out.println("Dog runned 5.k.m p/h yesterday");
             }
       }
          class Dog2 extends Dog1
             {
               void eat(double y)
            {
                System.out.println("dog eats only non veg");
             }
}
         class Dog3 extends Dog2
{

       public static void main(String[] args)
{
          Dog a = new Dog();
              a.walk();
           Dog1 b = new Dog1();
               b.walk(3);
               b.walk();
             Dog2 c = new Dog2();
        c.walk(8);
        b.walk();                
        c.eat(6.000);
}
}
            
