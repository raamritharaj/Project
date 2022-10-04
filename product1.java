
  public class product1
{
  int z=1001;
   }
    class product2 extends product1
{
   int z=1002;
   }
  public class Test extends product2
{
  public static void main(String[] args)
{
    product2 a=new product2();
     System.out.println("z value is"+a.z);
    product1 b=new product2();
     System.out.println("z value is"+b.z);
}
}
