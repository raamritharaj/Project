class Boutique
 {
  int price,discount;

   Boutique(int price, int discount)
{
   this.price = price;
   this.discount = discount;  

  System.out.println("I am constructor");
}
 
   public static void main(String[] args)
   {

     Boutique shirt = new Boutique(450,35);
     Boutique phant = new Boutique(760,56);

       shirt.billing();
        phant.billing();
          shirt.cashOnDelivary();
}
    void billing() 
{
       System.out.println(price);
              System.out.println(discount);
}
  void cashOnDelivary()
{
  System.out.println("Shirt price is low" + (price -discount));

 }
}
