class Pharmacy
{
  static String name = "Vicky Pharmacy";
    int price;
     static int offer=25; 
   public static void main (String [] args)
{
    Pharmacy Tablet1 = new Pharmacy();
     Pharmacy Dolo = new Pharmacy();
      Pharmacy Tablet2 = new Pharmacy();

         Tablet1.price = 500;
          Dolo.price = 600;
           Tablet2.price = 800; 
           
              Tablet1.offer();
           

             System.out.println(Tablet2.price);
               System.out.println(Tablet1.price);
                 System.out.println(Dolo.price);

              System.out.println(Pharmacy.name);
                System.out.println(Dolo.name);
                   System.out.println(name); 

                 Dolo.sellingprice();
                     Tablet1.sellingprice(); 
                       Tablet2.sellingprice(); 
        

}

    void sellingprice()
      {
         System.out.println("selling price is" + price);
          } 
 
   static void offer()
{
      System.out.println("we give  offer %"+ offer);
 
          }
             }
               

